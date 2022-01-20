
public class Loops {

	public static void main(String[] args) {
		
		char blacksquare = '\u25A1';
		char whitesquare = '\u25A0';
		System.out.println(whitesquare);
		System.out.println(blacksquare);
		
		// while loop
		int index = 1;
		while(index<=4) {
			System.out.print(whitesquare+ " ");
			System.out.print(blacksquare+ " ");
			index++;
			
		}
		System.out.println("Line 1 ");
		//do while loop
		do {
			System.out.print(whitesquare+ " ");
			System.out.print(blacksquare+ " ");
			index++;
		}
		while(index<=4);
		System.out.println("Line 2 ");
		//for loop
		for(int i=0; i<4; i++) {
			System.out.print(whitesquare+ " ");
			System.out.print(blacksquare+ " ");
		}
		System.out.println("Line 3 ");
	
	                // Nested Loops
	
	for(int i=1;i<=3;i++) {
		
		System.out.println(">> i is: "+i);
		
		for(int j=1;j<=5;j++) {
			System.out.print(j+" ");
		}
		
		System.out.println();
	}
	
	System.out.println();
}
}
