package Object.Project.Builder;

import java.util.ArrayList;
import java.util.Scanner;

import Object.Project.InPreparation;
import Object.Project.Project;
import Object.User.User;
import Post.Post;

public class BuilderProject {
	private Project project;
	private Scanner cin = new Scanner(System.in);
	
	String fund;

	public Project get(int id) {
		build(id);
		return project;
	}

	private void build(int id) {
		System.out.println("Project name: ");
		String name = cin.nextLine();
		System.out.println("Initial Date:");
		String start = cin.nextLine();
		System.out.println("Final date: ");
		String end = cin.nextLine();
		System.out.println("Funding Agency: ");
		String funding = cin.nextLine();
		System.out.println("Funds: ");
		try {
			fund = cin.nextLine();
		} catch (NumberFormatException nfe) {
            System.out.println("Input must be a number.");
            }
		System.out.println("Objectives: ");
		String objective = cin.nextLine();
		System.out.println("Infos: ");
		String info = cin.nextLine();
		project = new InPreparation(name, start, end, funding, fund, objective, info, new ArrayList<User>(), new ArrayList<Post>());
		project.setId(id);

	}
}
