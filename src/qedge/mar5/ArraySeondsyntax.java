package qedge.mar5;

public class ArraySeondsyntax {
	/*  user1	pass1
	user2	pass2
	user3	pass3
	user4	pass4
	user5	pass5*/
	public static void main(String[] args) {
		 
			//store login data into two dimension
	Object str[][] = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"},{"user4","pass4"},{"user5","pass5"}}; //five rows two cells
	
	//print row length
	System.out.println(str.length);
	//print cell length in any row
	System.out.println(str[0].length);
	//print specific row cell data
	System.out.println(str[2][1]);
	System.out.println("================");
	//iterate all rows
	for(int i=0;i<str.length;i++)
	{
		//iterate all cells in each row
		for(int j=0;j<str[i].length;j++)
		{
			//  print all row each cell data
			System.out.print(str[i][j]+"\t");
		}
		System.out.println();
		}
	}
		


	}


