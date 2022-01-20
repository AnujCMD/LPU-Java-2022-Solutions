import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		char blackSquare = '\u25A1';	// 1
		char whiteSquare = '\u25A0';	// 0
		char queen = '\u2655';
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Position of Queen #1:");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		System.out.println("Enter Position of Queen #2:");
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		System.out.println("Enter Position of Queen #3:");
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		System.out.println("Enter Position of Queen #4:");
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		
		if(a1==b1 || a1==c1 || a1==d1 || b1==c1 || b1==d1 || c1==d1 || a2==b2 || a2==c2 || a2==d2 || b2==c2 || b2==d2 || c2==d2) {
			System.out.println("Queen's cannot be placed in same row or column");
		}
		else {
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(i==a1 && j==a2) {
					System.out.print('\u2655'+ " ");
				}
				if(i==b1 && j==b2) {
					System.out.print('\u2655'+ " ");
				}
				if(i==c1 && j==c2) {
					System.out.print('\u2655'+ " ");
				}
				if(i==d1 && j==d2) {
					System.out.print('\u2655'+ " ");
				}
				
				if(i%2==0) {
					if(i==a1 && j==a2) {
						continue;
					}
					if(i==b1 && j==b2) {
						continue;
					}
					if(i==c1 && j==c2) {
						continue;
					}
					if(i==d1 && j==d2) {
						continue;
					}
					
					char square = ( (j+1) % 2 == 0 )? blackSquare : whiteSquare;
					System.out.print(square+" ");
					}
				 
			 else {
				 if(i==a1 && j==a2) {
						continue;
					}
					if(i==b1 && j==b2) {
						continue;
					}
					if(i==c1 && j==c2) {
						continue;
					}
					if(i==d1 && j==d2) {
						continue;
					}
					char square = (j % 2) == 0 ? blackSquare : whiteSquare;
					System.out.print(square+" ");
				}
				
			}
			System.out.println();
		}

	}
	}
}


		
		
