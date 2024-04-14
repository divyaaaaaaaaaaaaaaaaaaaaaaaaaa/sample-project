package qedge.mar7;

public class split {

	public static void main(String[] args) {
		// split
		String str="welcome to very wonderful world";
		System.out.println(str.length());
		System.out.println("=====================");
		String x[]=str.split("very");
		String y[]=str.split(" very ");
		String z[]=str.split(" ");
		System.out.print(x[0]);
		System.out.println(x[1]);
		System.out.println("===================");
		System.out.println(y[0]);
		System.out.println("===================");
		System.out.println(z[0]);
		System.out.println("===================");
		String st="TCS@GOOGLE@AMAZON@FLIPKART@HCL@IBM@TATACLIQ";
		String P[]=st.split("@");
		System.out.println(P[3]);
		System.out.println("===================");
		for (String each : P) 
		System.out.println(each);
		System.out.println("===================");
		String s="10/10/1992";
		String q[]=s.split("/");
		System.out.println(q[0]);
		System.out.println(q[1]);
		System.out.println(q[2]);
		
		{
			
		}
		}

}
