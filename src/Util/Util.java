package Util;

import java.util.ArrayList;
import java.util.LinkedList;

import Lab.Lab;
import Object.Project.Completed;
import Object.Project.InPreparation;
import Object.Project.InProcess;
import Object.Project.Project;
import Object.User.Graduate;
import Object.User.Teacher;
import Object.User.User;
import Object.User.underGraduate;
import Post.Post;




public class Util {

	public User test(){
		System.out.println("tyedvhqwjnd");
		Lab l = new Lab();
		//ArrayList<User> users;
		for(User u : l.users){
			System.out.println(u);
		return u;
		}
		return null;
	}
	
	public void showU(ArrayList<User> users) {		
		for(int i = 0; i<users.size();i++){
		System.out.println(+users.get(i).getId() +  "  "   + users.get(i).getName());
		}
		/*for (User user : users) {
			System.out.println(user.getId() + " - " + user.getName());
//	System.out.println(users);
		}*/
	}

	public void showU(ArrayList<User> users, ArrayList<User> arrayList) {
		for (User user : users) {
			if (!arrayList.contains(user))
				System.out.println(user.getId() + " - " + user.getName());
		}
	}

	public void showU(ArrayList<User> users, StateUser state) {
		for (User user : users) {
			switch (state) {
			case TEACHER:
				if (user instanceof Teacher)
					System.out.println(user.getId() + " - " + user.getName());
				break;
			case GRADUATE:
				if (user instanceof Graduate)
					System.out.println(user.getId() + " - " + user.getName());
				break;
			case UNDERGRATUATE:
				if (user instanceof underGraduate)
					System.out.println(user.getId() + " - " + user.getName());
				break;
			}
		}
	}

	public void showP(ArrayList<Project> projects) {
		for (Project project : projects) {
			System.out.println(project.getId() + " - " + project.getName());
		}
	}

	public void showP(ArrayList<Project> projects, StateProject state) {
		for (Project project : projects) {

			switch (state) {
				case COMPLETED:
					if (project instanceof Completed)
						System.out.println(project.getId() + " - " + project.getName());
					break;
				case INPREPARATION:
					if (project instanceof InPreparation)
						System.out.println(project.getId() + " - " + project.getName());
					break;
				case INPROCESS:
					if (project instanceof InProcess)
						System.out.println(project.getId() + " - " + project.getName());
					break;
				}
		}
	}

	public int countPosts(ArrayList<Post> posts, int id) {
		int count = 0;
		for (Post post : posts) {
			if (post.getIdProject() == id)
				count++;
		}
		return count;
	}

	private void getPosts(ArrayList<Post> posts, int id) {
		for (Post post : posts) {
			if (post.getIdAuthor() == id)
				System.out.println(post.getContent());
		}
	}
	private void getProject(User user, ArrayList<Project> projects) {
		for (Project project : projects) {
			if (project.getParticipants().contains(user))
				System.out.println(project.getId() + " - " + project.getName());
		}
	}
	public void consultUser(User user, ArrayList<Post> posts, ArrayList<Project> projects) {
		System.out.println("Name: " + user.getName());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Address: " + user.getAddress());
		System.out.println("My Posts: ");
		getPosts(posts, user.getId());
		System.out.println("My Projects: ");
		getProject(user, projects);

	}
	public void consultProject(Project project, ArrayList<Post> posts, ArrayList<User> users){
		System.out.println("Name: " + project.getName());
		System.out.println("Funding: " +project.getFunding());
		System.out.println("Funds: " +project.getFund());
		System.out.println("Project Objective: " + project.getObjective());
		System.out.println("Project Info: " +project.getInfo());
		System.out.println("Initial Date: " +project.getStart());
		System.out.println("Final Date: " +project.getEnd());
		System.out.println("Members: ");
		showU(users);
		System.out.println("");
		System.out.println("Articles: ");
		getPosts(posts, project.getId());
		
	}
	
	public int countMembers(LinkedList<User> users){
		int a = users.size();
		return a;
	}
	
	public int countTotalProjects(LinkedList<Project> projects){
		int a = projects.size();
		return a;
	}
	
	public int countPost(LinkedList<Post> posts){
		int a = posts.size();
		return a;
	}



	

}