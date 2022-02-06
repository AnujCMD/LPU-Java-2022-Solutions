class FlightBooking{
	String from;
	String to;
	String departure;
	int numOfTravellers;
	String travelClass;
	
	//Default Constructor is a constructor with NO argument
	FlightBooking(){
		from = "Delhi";
		to = "Mumbai";
		departure= "26th Jan, 2022";
		numOfTravellers = 1;
		travelClass = "Business";	
	}

	FlightBooking(String fl, String tl, String dd, int nt, String tc) {	
		from = fl;
		to = tl;
		departure = dd;
		numOfTravellers = nt;
		travelClass = tc;
	}
	void updateFlightBooking(String fl, String tl, String dd, int nt, String tc) {	
		from = fl;
		to = tl;
		departure = dd;
		numOfTravellers = nt;
		travelClass = tc;
	}
	
	void showFlightDetails() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Booking Details:");
		System.out.println(from+" to "+to
				+" on "+departure+" for "+numOfTravellers+" in "+travelClass);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	
}

public class Contructors {

	public static void main(String[] args) {
		FlightBooking booking_1 = new FlightBooking();
		FlightBooking booking_2 = new FlightBooking("Chandigarh", "Delhi", "1st Feb", 3, "Economy");
		booking_1.showFlightDetails();//before updation
		booking_1.updateFlightBooking("Mumbai", "Chennai", "26th Jan", 2, "Economy");
		booking_2.showFlightDetails();
		booking_1.showFlightDetails();
	}

}
