// Assignment: 1. Explore labels with break and continue in Java and write a program for the same
//           Syntax for Label
//           label:
//           {
//           statement1;
//           statement2;
//           statement3;
//           .
//           .
//           }
public class Question4 {

	public static void main(String[] args) {

		firstfloor:
		{
			for(int i=1; i<10; i++) {
				System.out.println("First floor reached");
				break;
			}
			for(int floor = 1; floor<=10; floor++)
			if(floor>=2) {
				continue;
			}
			System.out.println("Floor 1 Reached;");
		}
		secondfloor:
		{
			for(int i=1; i<10; i++) {
				System.out.println("Second floor reached");
				break;
			}
			for(int floor = 1; floor<=10; floor++)
			if(floor>=3 && floor==1) {
				continue;
			}
			System.out.println("Floor 2 Reached;");
		}
		
	}

}
