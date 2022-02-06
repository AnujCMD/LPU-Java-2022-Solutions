class MobileBill{
	private String phoneNum;
	private String operator;
	private int amount;
	
	//Default constructor
	MobileBill(){
		phoneNum = "";
		operator = "";
		amount = 10;
	}
	void showDetails() {
		System.out.println("Details are: ");
		System.out.println(phoneNum+ " will be recharge with "+operator+" for amount "+amount);
	}
	//Now we use Setter Method and getter method to indirectly
	// access the private attributes of object
	//Getter Method
			String getPhone() {
				return phoneNum;
			}
	//Setter Method
	void setPhone(String number) {
		if(!number.isEmpty() && number.length() >= 10 && number.startsWith("+91")) {
			phoneNum = number;
		}
		else {
			System.out.println("Invalid Phone Number");
		}
	}
	void setOperator(String op) {
		String operatorList = "airtel, idea, jio, vodafone";
		if(operatorList.contains(op.toLowerCase())) {
			operator = op;
		}else {
			System.out.println("Please select a valid Operator");
		}
	}
	
	String getOperator() {
		return operator;
	}
	
	void setAmount(int amt) {
		if(amt >=10 && amt <=20000) {
			amount = amt;
		}else {
			System.out.println("Invalid Amount");
		}
	}
	
	int getAmount() {
		return amount;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		MobileBill bill1 = new MobileBill();
		bill1.setPhone("+91 99999 88888");
		bill1.setAmount(399);
		bill1.setOperator("Airtel");
		bill1.showDetails();
		
		System.out.println(bill1.getOperator() +" " + bill1.getAmount());

	}

}
