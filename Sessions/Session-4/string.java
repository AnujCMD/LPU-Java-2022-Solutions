public class string {
    public static void main(String[] args){

        char ch = 'J';

        // Interned String -> refers directly to the literal
        String name1 = "John Watson";

        //Object String -> String is created inside the Heap with data

        String name2 = new String("Rajesh kumar");

        // STRING are MULTI value Container

        System.out.println("name1 is: "+name1);
        System.out.println("name2 is: "+name2);
        

        //tostring function
        //print the data textual content rather than the HASH CODE
        // no need to execute to string
        //automatically executed by the compiler

        System.out.println("Name1 is: "+name1.toString());
        System.out.println("Name2 is: "+name2.toString());

    }
    
}
