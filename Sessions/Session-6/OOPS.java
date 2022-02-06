class User{ // defination of USER object
	//this all are the property / arguments of the object
	String name;
	String phone;
	String email;
	char gender;
	String addressline;
	String city;
	String state;
	int pincode;
}


public class OOPS {

	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		User user3 = user1;
		//user object are reference variables
		//they contain the hash code of the USER object
		System.out.println("user1 is = "+user1);
		System.out.println("user2 is = "+user2);
		System.out.println("user3 is = "+user3);
		System.out.println();
		
		//Operations on the objects
		
		//1. Add Data
		user1.name = "Anuj";
		user1.phone = "+91 99999 88888";
		user1.addressline = "Somewhere not in the Internet";
		user1.gender = 'M';
		user1.email = "hahaha@gmail.com";
		user1.city = "Delhi";
		user1.state = "Delhi";
	
		user2.name = "Fatal";
		user2.phone = "+91 99999 88887";
		user2.addressline = "Somewhere not in the Internet";
		user2.gender = 'M';
		user2.email = "fatal@hotmail.com";
		user2.city = "London";
		user2.state = "UK";
		//2. update data
		user3.name = "Not  Fatal"; // kind of updating User1 or do it directly user1.name = "Satan"
		user3.phone = "+91 99999 88886";
		user3.addressline = "Somewhere not in the Internet";
		user3.gender = 'F';
		user3.email = "NOTfatal@hotmail.com";
		user3.city = "Boston";
		user3.state = "USA";
		//3. Read data
		System.out.println("user1 details :");
		System.out.println(user1.name+ " lives in "+user1.addressline+ " having PhoneNo."+user1.phone);
		
		System.out.println("user2 details : ");
		System.out.println(user2.name+ " lives in "+user2.addressline+ " having PhoneNo."+user2.phone);
		
		System.out.println("user3 details : ");
		System.out.println(user3.name+ " lives in "+user3.addressline+ " having PhoneNo."+user3.phone);
		//OUTPUT
		/*user1 is = User@6504e3b2
				user2 is = User@379619aa
				user3 is = User@6504e3b2

				user1 details :
				Not  Fatal lives in Somewhere not in the Internet having PhoneNo.+91 99999 88886
				user2 details : 
				Fatal lives in Somewhere not in the Internet having PhoneNo.+91 99999 88887
				user3 details : 
				Not  Fatal lives in Somewhere not in the Internet having PhoneNo.+91 99999 88886*/
		
		//4. Delete Data
		/*
		 * user1 = null;
		 * user2 = null;
		 * user3 = null;
		 */
		// or to free up unused object use 
		// System.gc();
}

}
