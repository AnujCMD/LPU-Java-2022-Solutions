
public class MutableString {

	public static void main(String[] args) {
		String str = new String("John");
		String name = str + " Watson";
		//or
		String name1 = str.concat(" Watson");
		System.out.println("str is = "+str);
		System.out.println("name is = "+name);
		System.out.println("name1 is = "+name1);
		
		//Mutable String through StringBuffer and StringBuilder
		StringBuffer buffer_1 = new StringBuffer("John");
		buffer_1.append(" Watson");
		System.out.println("buffer_1 is : "+buffer_1);
		StringBuilder builder_1 = new StringBuilder("John");
		builder_1.append(" Watson");
		System.out.println("Builder_1 is: "+builder_1);
	}

}
