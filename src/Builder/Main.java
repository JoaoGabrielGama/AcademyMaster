package Builder;

import java.util.Scanner;

import Lab.Lab;

public class Main {

	private static Scanner cin;

	public static void main(String[] args) throws Exception {
		Lab lab = new Lab();

		cin = new Scanner(System.in);

	while(true){	
		System.out.println("1 - Add User or Project");
		System.out.println("2 - Alloc User and Projects");
		System.out.println("3- Include Post: ");
		System.out.println("4 - Complete Project");
		System.out.println("5 - Consult User");
		System.out.println("6 - Consult Project");
		System.out.println("7 - Consult Laboratory statistics");
		int op = cin.nextInt();
		switch (op) {
		case 1:try {
			lab.add();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
			break;
		case 2:
			try {
				lab.alloc();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}
			break;
		
			
		case 3:
			try {
				lab.post();
			} catch (Exception e) {
				// TODO: handle exception
			}break;
		case 4:
			try{
				lab.completeProject();
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case 5:
			try {
				lab.consultUser();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
			
		case 6:
			try {
				lab.consultProject();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case 7:
			try {
				lab.consultLabStatistics();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;

		default:
			break;
		}
	}
		

	}

}
