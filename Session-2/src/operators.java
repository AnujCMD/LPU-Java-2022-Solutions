/*
 	MODEL
 	
 	VIEW
 	
 	CONTROLLER
 		Logical Operations
 			1. Operators for Computation
 			2. if/else and switch case for decision making
 			3. loops for iterations
 			
 			PS: For Controller, MODEL will be data provider
 */
public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Here we go with the operators
		
		//1. Arithmetic Operator includes + - * / etc
		//used for calculation
		double amount = 1200;
		double tax = 0.12;
		double total = amount + (tax * amount); // parenthesis is being used here
		// this is basic use of the arithmetic operators 
		System.out.println("The Total amount is " +total);
		//can also be done as
		System.out.println("THE total with addition if 1000 is " +total+1000);
		//output would be 1344.01000 because the constant int are 32 bit and double is 64 bits
		//there would be no problem if the addition of 1000 is with int.
		
		
		
		        // 2. Assignment Operators
		// =  +=, -=, *=, /=, %=
		int a = 100;
				int b = 50;
		b += a;
		System.out.println("The result of b = b +a is " +b);
		
		// % this is modulo to give the remainder of the two numbers or variables
        
		int a1 = 49;
		int a2 = 5;
		System.out.println("The remainder of a1 and a2 is " +a1%a2);
		
		// 3. Increment and Decrement operators
				// ++ and --
				// ++ increments by 1
				// -- decrements by 1
		
		int quantity = 1;
		quantity++;
		System.out.println("THe Quantity is " +quantity);
		System.out.println("THe Quantity is " +quantity);
		quantity = 10;
		++quantity;
		System.out.println("THe Quantity is " +quantity);
		
		// 4. Conditional or Relational
				// >, <, >=, <=, ==, !=
		//return true or false
		int attendance = 82;
		System.out.println("Is attendace above 80 " +(attendance>=80));
		attendance = 40;
		int required = 75;
		System.out.println("Is he/she eligible " +(attendance == 80));
		
		
		// 5. Logical Operators
		// && and, || or, ! not
		int Coffee = 100;
		int requiredCoffee = 80;
		int Sugar = 80;
		int requiredSugar = 10;
		System.out.println("Can we make sweet coffee? " +((requiredCoffee <= Coffee) && (requiredSugar<= Sugar)));
		
		
		
		

	}

}
