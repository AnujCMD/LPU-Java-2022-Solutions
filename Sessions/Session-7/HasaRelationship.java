class User{
	String name;
	String phone;
	String email;
	
	// one user has one address
	Address address; // Has-A relationship (1 to 1)
	Order[] orders; // Has-A relationship(1 to MANY)
	
	User(){
		
	}

	User(String name, String phone, String email, Address adress, Order[] orders) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = adress;
		this.orders = orders;
	}
	void showUser() {
		System.out.println("User Details: ");
		System.out.println(name+" "+phone+" "+email);
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		address.showAddress();
		
		System.out.println("Order for User"+name);
		for(Order order: orders) {
			order.showOrder();
		}
	}
	
}
class Address{
	String addressLine;
	String city;
	String state;
	int zipcode;
	String label;
	Address(){
		
	}
	Address(String addressLine, String city, String state, int zipcode, String label) {
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.label = label;
	}
	void showAddress() {
		System.out.println("Address Details: ");
		System.out.println(addressLine+ " "+city+" "+state+" "+zipcode+" "+label);
		System.out.println();
	}
	
	
}
class Order{
	int oid;
	String date;
	int amount;
	Order(){
		
	}
	Order(int oid, String date, int amount) {
		this.oid = oid;
		this.date = date;
		this.amount = amount;
	}
	void showOrder() {
		System.out.println("Order Details: ");
		System.out.println(oid+" "+date+" "+amount);
		System.out.println();
	}
	
}
public class HasaRelationship {

	public static void main(String[] args) {
		Order o1 = new Order(1, "12 Jan 2022", 200);
		Order o2 = new Order(2, "16 Jan 2022", 500);
		Order o3 = new Order(3, "18 Jan 2022", 400);
		Order[] orders = {o1,o2,o3}; // array of object
		Address aRef = new Address("Redwood", "Punjab", "Punjab", 141001, "Work");
		User uRef = new User("John", "+91 99999 88888", "john@gmail.com", aRef, orders);
		uRef.showUser();
		//OUTPUT
		/* 	User Details: 
			John +91 99999 88888 john@gmail.com
			~~~~~~~~~~~~~~~~~~~~
			Address Details: 
			Redwood Punjab Punjab 141001 Work
			
			Order for UserJohn
			Order Details: 
			1 12 Jan 2022 200
			
			Order Details: 
			2 16 Jan 2022 500
			
			Order Details: 
			3 18 Jan 2022 400
*/
	}

}
