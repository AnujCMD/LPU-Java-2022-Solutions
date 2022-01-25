public class StringBuiltInMethods {
    public static void main(String[] args){

        String names = "John, Jennie, Jim, Joe, Jack";
        //           indexOf
        int idx = names.indexOf('o');
        System.out.println("Index of o is :"+idx);
        //          index of word
        System.out.print("Index of JIM: "+names.lastIndexOf("Jim"));
        //          LastIndexOf
        int idx1 = names.lastIndexOf('o');
        System.out.println("From Last Index of 'J' is: "+idx1);
        //          CharAt
        char ch = names.charAt(4);
        System.out.println("Char at index 4 is : "+ch);
        //          Length of String
        int length = names.length();
        System.out.println("Length of String: "+length);
        //         charAt length
        ch = names.charAt(length-1);
;        System.out.println("Char at length: "+names.charAt(length-1));
        



        //          SUBSTRING
        idx = 0;
        String subs = names.substring(idx);
        System.out.println("Here is the substring from idx till end: "+subs);
        String name = names.substring(idx, 10);
        System.out.println("The substring is : "+name);
        String Case  = "Rajesh, Ramesh, Suresh, Susesh";
        //            String Array
        String[] strArr = Case.split(",");
        for(String str : strArr){
        System.out.println(str.trim());
        }
        //   contains / endswith / starts with
        String email = "anujjoshi32@gmail.com";
        if(email.contains(".") && email.contains("@")){
            System.out.println("A Valid Email");

        }
        else 
        System.out.println("Not a Valid Email");
    
        String googleEmail = "anujjoshi@gmail.com";
        if(googleEmail.endsWith("@gmail.com")){
            System.out.println("This is a Google Mail");

        }
        else
        System.out.println("This is not a Google Mail");
    }
    
    
}
