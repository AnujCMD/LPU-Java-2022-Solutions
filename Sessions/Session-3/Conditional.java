import java.util.Scanner;

/*
 	View
 		Console Based -> black screen with text
 		GUI Based -> Screen with interfaces having ui elements like textfields, buttons etc
 	
 	Controller
 		Operators
 		if/else
 		loops
 */

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE AMOUNT");
		int amount = scanner.nextInt();
		System.out.println("The Amount user gave is " +amount);
		//String promoCode = scanner.nextLine(); // to read a String

		//to flush the memory


	               // If else statements
		int chai = 10;
		int coffee = 20;
		int wallet = 40;

		if(wallet <= coffee) {
			System.out.println("Coffee bought and the wallet balance is " +(wallet - coffee));
		}
		else {
			System.out.println("Chai bought and the wallet balance is " +(wallet - chai));
		}

		          //Nested if else

		if(chai <= wallet)
		{
			if(chai+coffee <= wallet) {
				System.out.println("Chai and coffee both bought");
				wallet = wallet - chai - coffee;
			}
			else
				System.out.println("Only Coffee bought");

		}
		else if (coffee<=wallet) {
			if(coffee< 10) {
				System.out.println("Not in the mood");

			}
			else
				System.out.println("Too expensive");

		}
		else 
			System.out.println("Coffee bought");

	System.out.println("Wallet Balance" +wallet);


	             // SWITCH case



	final int case1 = 101; // final is a constant in java
	//case1 = 2000; // error

	int promocode = scanner.nextInt();

	switch (promocode) {

		//case case1: -> cases cannot be variables :) -> error
		//case 101:	
		case case1:	// -> ok if you mark case1 as final :)
		{
			System.out.println("Promocode 101 applied");

		}
		case 102:
		{
			System.out.println("Promocode 102  applied");
		}
		default:
			System.out.println("Invalid");
	}
	scanner.close();

	}
}