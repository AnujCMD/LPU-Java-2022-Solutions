public class MethodsInMemory{
    void squar(int number){
        System.out.println("Function Started");
        System.out.println("Number before is: "+number);
        number = number * number;
        System.out.println("Number after is: "+number);
        System.out.println("Function Finished");

    }
            public static void main(String[] args){
                
                System.out.println("main - Started");
                // Object Construction Statement;
                MethodsInMemory var = new MethodsInMemory();
                int x = 100;
                System.out.println("Data before is: "+x);
                var.squar(x);
                System.out.println("Data after is: "+x);
                System.out.println("main - Finished");
            }
}