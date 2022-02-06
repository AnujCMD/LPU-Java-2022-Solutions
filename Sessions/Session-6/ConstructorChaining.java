class Customer{
	String name;
	String phone;
	String email;
	boolean isPrime;
	String membershipValidtill;
	boolean isMusicAccessible;
	boolean isVideoAccessible;
	Customer(){
		
	}
	Customer(boolean isPrime) {
		if(isPrime) {
		this.isPrime = isPrime;
		this.membershipValidtill = "26th Jan, 2023";
		this.isMusicAccessible = true;
		this.isVideoAccessible = true;
		}
	}
	public Customer(String name, String phone, String email, boolean isPrime) {
		
		
		this(isPrime);
		//this constructor execution is always the first statement
		
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.isPrime = isPrime;
		
	}
	
	void showCustomerDetails() {
		System.out.println("Customer Details: ");
		System.out.println(name+" "+phone+" "+email);
		if(isPrime) {
			System.out.println("Prime Renews on: "+membershipValidtill);
		}
		
		System.out.println();
	}
	
}

public class ConstructorChaining {

	public static void main(String[] args) {
		Customer customer1 = new Customer("John", "+91 99999 88888" ,"abc", true);
		
		customer1.showCustomerDetails();
	}

}
