package Object.User.Builder;

import java.util.Scanner;

import Object.User.Graduate;
import Object.User.underGraduate;
import Object.User.Teacher;
import Object.User.User;

public class BuilderUser {
	private User user;
	private Scanner cin = new Scanner(System.in);


	public User get(int id) {
		build(id);
		System.out.println(user);
		return user;
	}

	private void build(int id) {
		System.out.println("Name:");
		String name = cin.nextLine();
		System.out.println("Email:");
		String email = cin.nextLine();
		System.out.println("Address:");
		String address = cin.nextLine();
		System.out.println("Type:\n\n1 - Graduation\n2 - Teacher\n3 - Master\n4 - PHD");
		int op = cin.nextInt();
		switch (op) {
		case 1:
			user = new underGraduate(id, name, email, address);
			
			break;
		case 2:
			user = new Teacher(id, name, email, address);
			break;
		case 3:
			user = new Graduate(id, name, email, address);
			break;
		case 4:
			user = new Graduate(id, name, email, address);
			break;
		}
	}

	
}
