package week2.day1;

public class findTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char [] strArr=test.toCharArray();
       for (int i=0 ; i<=strArr.length -1; i++ ) {
    	   boolean b1,b2;
    	   if ( b1 = Character.isLetter(strArr[i]) ) {
    		   letter++;
    		   System.out.println(strArr[i] + "letter: " + letter );
    	   }
    	   else if ( b1 = Character.isDigit(strArr[i]) ) {
    		   num++;
    	
    		   System.out.println(strArr[i] + "num: " + num );
    		   
    	   }
    	   else if ( b1 = Character.isSpaceChar(strArr[i]) ) {
    		   space++;
    	
    		   System.out.println(strArr[i] + "space: " + space );
    		   
    	   }
    	   else {
    		   specialChar++;
    		   System.out.println(strArr[i] + "specialChar: " + specialChar );
    	   }
       }
       System.out.println("length " + test.length());
       System.out.println("array length " + strArr.length );
       	System.out.println("Total letter: " + letter);
		System.out.println("Total space: " + space);
		System.out.println("Total number: " + num);
		System.out.println("total specialCharcter: " + specialChar);
	}
	

}
