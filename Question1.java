
         //Assignment: 1. Implement Ternary Operators if possible in above scenario
		// 			   2. Whenever a wrong promo code is applied, tell the user whats the right promo code 
		
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		int JUMBO = 101;
		int ZOMHELLO = 201;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Promocode:");
		int promocode = scanner.nextInt();
		
		String message1 = (promocode == JUMBO)? "Promocode Jumbo applied successfully ENJOY 50% off" : "JUMBO promocode not applicable:: use promocode:: Jumbo or Zomhello for great discounts";
		String message2 = (promocode == ZOMHELLO)? "Promocode ZOMHELLO applied successfully Enjoy 60% off" : "ZOMHELLO Promocode not applicable use promocode:: Jumbo or Zomhello for great discounts";
		
		System.out.println(message1);
		System.out.println(message2);
		scanner.close();
		
		

	}

}
