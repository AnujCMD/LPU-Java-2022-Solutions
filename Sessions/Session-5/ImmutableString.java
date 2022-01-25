public class ImmutableString {
    public static void main(String[] args){

        //String are immutable
        // We cannot modify a string after creating it in the memory
        String quote = "be exceptional";
        System.out.println("Quote is: "+quote);
        String upperCaseQuote = quote.toUpperCase();
        System.out.println("Quote is not : "+quote);
        System.out.println("UpperCaseQuote String: "+upperCaseQuote);

        String names = "Rajesh, Suresh, Ramesh";
        System.out.println("Names are : "+names);
        String replacenames = names.replace('R', 'K');
        System.out.println("names now is: "+names);
        System.out.println("replacednames is: "+replacenames);




    }
    
}
