package qedge.mar5;

public class ObjArray {

	public static void main(String[] args) {
		// store diffrent type of data types using object array
		Object x []= new Object[5];
				x[0]=100;
				x[1]="Hello";
				x[2]='c';
				x[3]=34.023;
				x[4]=true;
				for (Object each : x) {
					System.out.println(each);
					
				}
	}

}
