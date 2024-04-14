package qedge.mar4;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// check courses 
		Scanner s = new Scanner(System.in);
	for(int i=1;i<=10;i++)
	{
		System.out.println("Enter your course ");
		String course =s.next();
		switch (course.toUpperCase()) {
		case "java":
			System.out.println("course is available"+course);
			break;
		case "SELENIUM":
			System.out.println("course is available"+course);
			break;
		case "PYTHON":
			System.out.println("course is available"+course);
			break;
		case "automation":
			System.out.println("course is available"+course);
			break;
		default:
			System.out.println("course is not available"+course);
			break;
		}
	}
	}

}
