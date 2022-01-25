public class StringComparison{
    public static void main(String[] args){
        String s1  = "John";
        String s2  = "John";
        
        String s3 = new String("John");
        String s4 = new String("John");

        if(s1 == s2) {
			System.out.println("1. s1 == s2");
		}else {
			System.out.println("1. s1 != s2");
		}
		
		if(s3 == s4) {
			System.out.println("2. s3 == s4");
		}else {
			System.out.println("2. s3 != s4");
		}
        if(s3.equals(s4)) {
			System.out.println("2. s3 == s4");
		}else {
			System.out.println("2. s3 != s4");
		}
        if(s2.equals(s4)) {
			System.out.println("2. s2 == s4");
		}else {
			System.out.println("2. s2 != s4");
		}
        if(s1.compareTo(s2) == 0) { // for equal output == 0, for greater 1 and for lesser -1
			System.out.println("6. s1 compared to s2");
		}else{
			System.out.println("6. s1 not compared to s2");
		}
        if(s1.equalsIgnoreCase(s2)){ // Ignore the upper and lower cases
                System.out.println("Here it is: "+s2);
        }
    }
}