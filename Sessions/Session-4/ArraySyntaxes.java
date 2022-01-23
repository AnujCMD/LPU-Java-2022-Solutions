

public class ArraySyntaxes{
    public static void main(String[] args){
                //Implicit Syntax
        //Syntax 1
        int array[]  = {22, 23, 34, 45, 100};
        System.out.println("Print Array1 = " +array);
         // Syntax 2
         int[] array1 = {22, 23, 34, 45, 100};
                //Explicit Syntax
                System.out.println("Print Array2 = " +array1);
        int array3[] = new int[]{10, 20, 30, 40};
        System.out.println("Print Array3 = " +array3);
        int[] array4 = new int[]{20, 30, 40 ,50};
        System.out.println("Print Array4 = " +array4);
        // when we don't know the elements for array, initialize with size
		// Syntax 5
        int array5[] = new int[5];
        int[] array6 = new int[5];
        


        int a1[], a2; // First one is array and second one is constant int
        a1 = new int[10];
        a2 = 256;

        int[] a3, a4;
        a3= new int[10];
        a4= new int[5];
        a3[2] = 34;
        System.out.println("This is a3 =="+a3);
        a3[2] = 34;
    }
    
}
