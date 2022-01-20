
public class OperatorsPart2 {

	public static void main(String[] args) {
		
		// 5. Bitwise Operators
		//    &, |, ^
		int num1 = 8; // 1000
		int num2 = 10;// 1010
		
		System.out.println("& = " +(num1&num2)); //a AND b
		System.out.println("^ = " +(num1^num2)); //a XOR b
		System.out.println("| = " +(num1|num2)); //a OR b
		
		// 6. Shift Operators
		// >>, <<, >>>
		
		int x= 8;
		int y=3;
		System.out.println("x >> y = " +(x>>y)); // x / 2powery    8 / 2power3
		System.out.println("x << y = " +(x<<y));// x * 2powery   8 * 2power3
		
		x = -11;
		y = 2;
		int z = x >> y;
		System.out.println("z now is: "+z);
		
		// 0 0 0 0 	1 0 1 1
		// 1 1 1 1  0 1 0 0
		//				+ 1
		// 1 1 1 1  0 1 0 1 -> -11
		// >> 2
		// _ _ 1 1  1 1 0 1
		// 1 1 1 1  1 1 0 1
		// 0 0 0 0  0 0 1 0
		//				+ 1
		// 0 0 0 0  0 0 1 1 -> -3
		
		// SE: see of you can do it with other methods :)
		//     work with right shift for negative numbers
		
		
		               //Ternary Operator
		int wallet = 400;
		int fare = 500;
		String message = (wallet>fare)? "Ride Booked" : "LOL! You dont have any money";
		System.out.println("message is " +message);
	}

}
