class OneWayFlightBooking{
	String fromLocation;
	String toLocation;
	String departure;
	int numOfTravellers;
	String travelClass;
	
	OneWayFlightBooking(){
		fromLocation= "Delhi";
		toLocation= "Mumbai";
		departure= "28th Jan 2022";
		numOfTravellers= 50;
		travelClass= "Economy";
	}

	OneWayFlightBooking(String fromLocation, String toLocation, String departure, int numOfTravellers,
			String travelClass) {
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departure = departure;
		this.numOfTravellers = numOfTravellers;
		this.travelClass = travelClass;
	}
	void show() {
		System.out.println("Booking Details:");
		System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~*");
		System.out.println("From "+fromLocation+" To "+toLocation+" On "+departure+" For "+numOfTravellers+" Travellers" + " In "+travelClass);
	}
	
}
//Now we book for return ticket also 
//so just for one variable we have to rewrite the code so we will Inheritance
class returnBooking extends OneWayFlightBooking{
	String returnDate;
	returnBooking(){
		
	}
	returnBooking(String returnDate){
		super();
		this.returnDate = returnDate;
	}
	returnBooking( String fromLocation, String toLocation, String departure, int numOfTravellers,
			String travelClass) {
		super(fromLocation, toLocation, departure,numOfTravellers, travelClass);
		
	}
	void show() {
		System.out.println("Round Trip Booking Details: ");
		super.show();
		System.out.println("Return on "+returnDate);
	}
	
}
public class WhyInheritance {

	public static void main(String[] args) {
		OneWayFlightBooking bookRef = new OneWayFlightBooking();
		bookRef.show();		
		
		returnBooking rRef = new returnBooking();
		rRef.show();
	}

}
