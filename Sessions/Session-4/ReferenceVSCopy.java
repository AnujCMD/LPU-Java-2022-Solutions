public class ReferenceVSCopy {
    public static void main(String[] args){
        

        //this is COPY

        int a = 10;
        int b = a;
        
        // This Reference 
        int[] a1 = {10, 20, 30 ,40 ,50};
        int[] a2 = a1;
        //PRINTING BOTH
        System.out.println("a is: " +a);
        System.out.println("b is: " +b);

        System.out.println("a1 is:"+a1);
        System.out.println("a2 is:"+a2);

        //UPDATE operation
        b= 20;
        a2[2] = 77;

        System.out.println("b is now" +b);
        System.out.println("a1[2] is: " +a2[2]);
        System.out.println("a2[2] is: " +a2[2]);

    }
    
}
