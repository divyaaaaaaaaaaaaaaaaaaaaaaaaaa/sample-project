package qedge.mar2;

import java.util.Scanner;

public class ConditionalStmnt {

	public static void main(String[] args) {
		// verify given marks whether pass or fail
		Scanner s = new Scanner( System.in);
		for (int i=1;i<10;i++)
		{System.out.println("enter your marks");
		int marks= s.nextInt();
		if  (marks>=35)
		{
			System.out.println("pass::" +marks);
			}
		else
		{System.out.println("fail:" +marks);
		}
		}
		}
	}

