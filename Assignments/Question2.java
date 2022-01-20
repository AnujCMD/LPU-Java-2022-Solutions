import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter where are you going(USER):");
		//String User = scanner.nextLine();
		//System.out.println("Enter where are you going(DRIVER):");
		//String Driver = scanner.nextLine();
		//System.out.println(User);
		//System.out.println(Driver);
		String User = "going mumbai";
		String Driver = "going mumbai";
		if(User == Driver)
		{
			System.out.println("Booking Accepted to Mumbai");
			System.out.println("Enter your OTP(USER):");
			int UserOTP = scanner.nextInt();
			System.out.println("Enter your OTP(DRIVER):");
			int DriverOTP = scanner.nextInt();
			if(DriverOTP == UserOTP) {
				System.out.println("OTP matched! Please Start your Journey");
			}
			else
			{
				System.out.println("OTP Not Matched! He is not your USER/DRIVER");
			}
			
		}
		else
			System.out.println("No Cabs available to Mumbai");
		scanner.close();
		
		
	}
}
	
