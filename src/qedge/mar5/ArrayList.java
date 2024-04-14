package qedge.mar5;
public class ArrayList {

	public static void main(String[] args) {
java.util.ArrayList<String> cars = new java.util.ArrayList<String>();
cars.add("Nexon");
cars.add("Altoz");
cars.add("harrier");
cars.add("Tiago");
cars.add("Innova");
cars.add("Switz");
cars.add("Safari");
cars.add("EV punch");
System.out.println(cars.size());
System.out.println(cars.get(7));
System.out.println("======================.");
for(int i=3;i<=6;i++)
	{
	System.out.println(cars.get(i));
	}
System.out.println("====================");
	for (int i=0;i<cars.size();i++)
	{
		System.out.println(cars.get(i));
	}
		
	}

}
