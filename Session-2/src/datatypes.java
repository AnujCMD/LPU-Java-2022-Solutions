/*
		 	MODEL 
		 		Storage Container
		 			1. Single Value Containers	| PRIMITIVE TYPES
		 				a single value
		 					
		 					INTEGRAL
		 					FLOATING POINT
		 					CHARACTER
		 					LOGICAL
		 				
		 			2. Multi Value Containers	| REFERENCE TYPES
		 				More than one value
		 				2.1 Homogeneous
		 					STRING
		 					ARRAY
		 					OBJECT
		 				
		 				2.2 Hetrogeneous
		 					OBJECT
		 			
		 	VIEW 
		 	
		 	CONTROLLER
		 	
		 	
		 	DATA TYPES -> To create a storage container we need to define the type of it
			 	1. Integral
			 		byte	8 bits
			 		short	16 bits
			 		int 	32 bits
			 		long	64 bits
			 		
			 	2. Floating Point
			 		float	32 bits
			 		double	64 bits
			 		
			 	3. Character
			 		char	16 bits
			 		
			 	4. 	Logical
			 		boolean	8 bits [out of 8 bits only 1 bit is used]
		 	
*/

public class datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      // BYTE
		// byte type data the allocated memory here is only limited to 8 bits
		byte age = 35;
		
		System.out.println("age is " +age);
		//updating the age with data more than 8 bits will give error
		// 8bits -> 2 power 8 | 256 | 256/2 => -128 to 0 to 127
				//age = 128; // error :
		age = (byte)127;
		System.out.println("age is now updated to " +age);
		
		
		 //  SHORT is 16 bits
		short s = 129;
		System.out.println("SHORT S IS " +s);
		// here the memory is upto 16 bits
		// DOUBLE AND INT with downcast and upcast theory 
		   // DOUBLE IS 64 bits and INT is 32 bits
		long data = 200;
		int number = (int)data;
		System.out.println("long data downcasted to int is " + number);
		 // 
		// Down Casting
				float pi = (float)3.14;
				// Up Casting
				double piAgain = pi;
	    // FLOATING POINT
				// FLOAT IS 32 bits
			     float a = 3.14f; //float a = 3.14 will give you an error so use f
			     //because decimal number are 64 bits 
			     // but float is  32 bits so here there is no automatic conversion 
			    
		
		   // CHAR
			     char ch = 65; // it will assign with subsequent ASCII CODE
			     ch = 'b'; //this will be printed with the quotes
			     char ch1 = '\u093E'; // this will assign the UNICODE the character related to it
			     // there are list of unicode available in the internet.
			     
		 //LOGICAL
			     
			//BOOLEAN 
			     boolean Life = false;
			     Life = false;
			     System.out.println("IS LIFE TRUE? " +Life);
			     //We humans dont know the life is true or false but this boolean operator just know two things 
			     //TRUE OR FALSE
			     
			  // Primitives cannot store data as multiple values :)
					// eg: we cannot put lot of data in the same container :)
					//int numbers = 10, 20, 30; // error
					//char chr = 'ABCD'; // error
	}

}
