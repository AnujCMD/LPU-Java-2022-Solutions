public class overloading {
    static void add(int num1, int num2){
            System.out.println(num1 + num2);
    }
    static void add(double num1, int num2){
        System.out.println(num1 + num2);
}
static void add(int num1, double num2){
    System.out.println(num1 + num2);
}
static void add(double num1, double num2){
    System.out.println(num1 + num2);
}
static void add(int num1, int num2, int num3){
    System.out.println(num1 + num2 + num3);
}
// // Compile Time Polymorphism
	// >> Overloading
	// RULES to Overload:
	// 1. Name must be Same
	// 2. Inputs must be UNIQUE
	// 		2.1 number of inputs
	//      2.2 type of inputs
	//      2.3 sequence of inputs
	// 3. Return type has no role to play
    public static void main(String[] args){
        add(10,10);
        add(10.23, 10.22);
        add(10, 10.23);
    }
}
