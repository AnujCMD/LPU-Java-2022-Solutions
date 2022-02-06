class Student{
	int roll;
	String name;
	Student(){
		System.out.println("this is: "+this);
	}
	Student(int roll, String name){
		this.roll = roll;
		this.name = name;
	}

}
class Dish{
	private String name;
	private int price;
	private String description;
	private double ratings;
	Dish() {
	
	}
	Dish(String name, int price, String description, double ratings) {
		this.name = name;
		this.price = price;
		this.description = description;
		this.ratings = ratings;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	String getDescription() {
		return description;
	}
	void setDescription(String description) {
		this.description = description;
	}
	double getRatings() {
		return ratings;
	}
	void setRatings(double ratings) {
		this.ratings = ratings;
	}
	
}
public class ThisKeyword {

	public static void main(String[] args) {
		Student s1  = new Student();
		Student s2 = new Student();
		System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
		System.out.println("s1 is : "+s1 );
		System.out.println();
		System.out.println("s2 is: "+s2);
		System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
		//OUTPUT
		/*this is: Student@6504e3b2
this is: Student@379619aa
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*
s1 is : Student@6504e3b2

s2 is: Student@379619aa
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~* */
}

}
