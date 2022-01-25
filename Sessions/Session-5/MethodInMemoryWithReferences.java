import java.util.Arrays;

public class MethodInMemoryWithReferences{

    static void square(int[] numbers){

        System.out.println("Number Hashcode before is: "+numbers);
        System.out.println("Number after is: "+Arrays.toString(numbers));
        for(int i=0;i<numbers.length; i++){
            numbers[i] = numbers[i] * numbers[i];
        }
    }
    public static void main(String[] args) {

        System.out.println("Main Method -- Started");
        int[] data = {10, 20, 30, 40, 50};
        System.out.println(data);
        System.out.println("Data in array"+Arrays.toString(data));
        square(data);
        System.out.println(data);// now Hashcode is same for the Numbers
        System.out.println(Arrays.toString(data)); // this is reference copy
    }
}