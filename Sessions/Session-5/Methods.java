public class Methods{
    int fun(int a, int b){
        int result = a*a + b*b + 2*a*b;
        return result;
    }
    static int fun1(int m){
        return (m/2);

    }
    public static void main(String[] args){
        int x, y;
        x= 4;
        y= 5;
        Methods var = new Methods();
        int z = var.fun(x, y);
        System.out.println("This is the result of Non-Static: "+var.fun(x,y)); // Non Static Fucntion call-out
        System.out.println(z);
        System.out.println("This is the result of Static: "+Methods.fun1(z));  // Static Function call-out
    }
}