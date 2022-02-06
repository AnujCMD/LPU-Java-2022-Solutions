class newDish{
	String name;
	int price;
	int quantity;
	newDish(){
		
	}
	newDish(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	void showDish() {
		System.out.println("Name: "+name+" Price is: "+price+" quantity is: "+quantity);
	}
	
}
public class ArrayOfObjects {

	public static void main(String[] args) {
		//Array of Integers
		int[] arr = {10,20,30,40};
		int[] arr1 = new int[5];
		
		Dish dish1 = new Dish("Noodles", 100, 1);
		Dish dish2 = new Dish("Pizza", 150, 1);
		Dish dish3 = new Dish("Noodles", 100, 1);
		Dish dish4 = new Dish("Pizza", 150, 1);
		
		//ArrayOfObjects
		Dish[] array = new Dish[5];
		array[0] =dish1;
		array[1]  = dish3;
		array[2] = dish2;
		array[3] =dish4;
		array[4] = new Dish();
		
		System.out.println("array: "+array);
		for(int i=0; i<array.length; i++) {
			array[i].showDish();
		}
	}

}
