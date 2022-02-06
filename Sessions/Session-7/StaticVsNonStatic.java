class Dish{
	
	//Non Static Attributes
	String name;
	int price;
	int quantity;
	
	//Static Attributes
	static int totalQuantity;
	static int totalPrice;
	static int numOfDishes;
	
	Dish(){
		numOfDishes++;
	}

	Dish(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
		totalQuantity += quantity;
		numOfDishes++;
		totalPrice += (price*quantity);
	}
	void showDish() {
		System.out.println("Dish: "+name+" "+price+" "+quantity);
		
	}
	void increment() {
		quantity++;
		totalQuantity++;
	}
	void decrement() {
		quantity--;
		totalQuantity--;
	}
	
	//Static Methods
	//Property of class
	//inside static method we cannot access non static properties
	static void showDishData() {
		System.out.println("Number of Dishes: "+numOfDishes);
		System.out.println("Total Quantity: "+totalQuantity);
		System.out.println("Total Price: "+totalPrice);
	}
	
}
public class StaticVsNonStatic {
	public static void main(String[] args) {
		Dish dish1 = new Dish("Noodles", 200, 1);
		Dish dish2 = new Dish("Burger", 100, 1);
		Dish dish3 = new Dish();
		Dish dish4 = new Dish("Fries", 80, 2);
		Dish dish5 = new Dish();
		
		dish1.increment();
		dish1.increment();
		dish2.increment();
		dish2.increment();
		dish2.increment();
		dish2.increment();
		dish1.decrement();
		dish1.increment();
		
		dish1.showDish();
		dish2.showDish();
		dish3.showDish();
		Dish.showDishData();
		//OUTPUT 
/*	Dish: Noodles 200 3
	Dish: Burger 100 5
	Dish: null 0 0
	Number of Dishes: 5
	Total Quantity: 10
	Total Price: 460*/
	}
}
