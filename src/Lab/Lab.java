package Lab;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import Builder.Builder;
import Object.Project.Completed;
import Object.Project.InPreparation;
import Object.Project.InProcess;
import Object.Project.Project;
import Object.User.Teacher;
import Object.User.User;
import Post.Post;
import Util.StateProject;
import Util.Util;



@SuppressWarnings("unused")
public class Lab {
	public ArrayList<User> users ;
	private ArrayList<Project> projects;
	private ArrayList<Post> posts;
	private Scanner cin = new Scanner(System.in);
	private Scanner ind = new Scanner(System.in);
	Util util = new Util();
	
	public Lab(){
		users = new ArrayList<User>();
		projects = new ArrayList<Project>();
		posts = new ArrayList<Post>();
	}
	
	public void add() throws Exception {
		System.out.println("1 - User\n2 - Project");
		int op = cin.nextInt();
		Builder builder = new Builder();
		
		try{
		
		switch (op) {
		case 1:
			System.out.println("");
			users.add(builder.buildUser(users.size()));
			System.out.println("User added");
			System.out.println(""+users.size());
			break;

		case 2:
			System.out.println("");
			projects.add(builder.buildProject(projects.size()));
			System.out.println("Project added");
			System.out.println(+projects.size());
			break;
		}
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		}
	



	

	public void alloc() throws Exception {

		util.showP(projects, StateProject.INPREPARATION);
		System.out.println("Project: ");
		int idProject = cin.nextInt();
		util.showU(users, projects.get(idProject).getParticipants());
		System.out.println("User:");
		int idUser = cin.nextInt();
		User u = users.get(idUser);
		projects.get(idProject).add(u);
		projects.set(idProject, (u instanceof Teacher) ? (InProcess) projects.get(idProject) : projects.get(idProject));
		System.out.println(projects.get(idProject).getName() + " in " + projects.get(idProject).state());
	}

	public void post() throws Exception {
		util.showP(projects, StateProject.INPROCESS);
		System.out.println("Project: ");
		int idProject = cin.nextInt();
		util.showU(projects.get(idProject).getParticipants());
		System.out.println("Select a user to link: ");
		int idUser = cin.nextInt();
		Calendar date = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		posts.add(new Post(idUser, idProject, formatter.format(date.getTime()), projects.get(idProject).getName()));
		System.out.println("Posted");
	}

	public void completeProject() throws Exception {
		util.showP(projects, StateProject.INPROCESS);
		System.out.println("Project: ");

		int id = cin.nextInt();

		if (util.countPosts(posts, id) < 1)
			System.out.println("It is not possible to complete project");
		else {
			Project p = projects.get(id);
			projects.set(id, (Completed) p);
			System.out.println("Project completed");
		}
	}

	public void consultUser() {
		System.out.println("user: ");
		
		for(int i = 0; i<users.size();i++){
			System.out.println(users.get(i).getName()+ " - " + users.get(i).getId());
		}
		//util.test();
		//util.showU(users);
		System.out.println("Insert id");
		int idUser = ind.nextInt();
		util.consultUser(users.get(idUser), posts, projects);
	}

	public void consultProject(){
		System.out.println("Project: ");
	//	util.showP(projects);
		
		for (Project project : projects) {
			System.out.println(project.getId() + " - " + project.getName());
		}
		System.out.println("Insert ID: ");
		int idProject = cin.nextInt();
		util.consultProject(projects.get(idProject), posts, users);
	}
	
	public void consultLabStatistics(){
		
		System.out.print("Total Projects: ");
		System.out.println(+projects.size());
		System.out.print("Total members: ");
		System.out.println(+users.size());
		System.out.print("Total posts: ");
		System.out.println(+posts.size());
				
}
	
//	public void consultProjectType(){
//		System.out.println("Project: ");
//		util.showP(projects, state);
//		int idProject = cin.nextInt();
//	
//
//				switch (state) {
//				case COMPLETED:
//					if (projects instanceof Completed)
//						System.out.println(projects.size());
//					break;
//				case INPREPARATION:
//					if (projects instanceof InPreparation)
//						System.out.println(projects.size());
//					break;
//				case INPROCESS:
//					if (project instanceof InProcess)
//						System.out.println(projects.size());
//					break;
//				}
//			}
	
	
	// função de incrementação, se for tirar o id do size.
	public int count(){
		int i = 0;
		if (i == 0 ){
			return i;
		}else{
			i+=1;
			return i;
		}
		
		
	}
}
	
