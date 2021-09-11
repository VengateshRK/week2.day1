package week2.day1;

public class palindromeStringPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "madam";
		
		String str2="";
		
		for (int i=str.length() -1; i >=0; i--) {
			str2= str2 + str.charAt(i);
			
			
		}
		System.out.println("" +str2);
		if(str.equals(str2))
		{
			System.out.println(str2 + " is a palindrome");
		}
		else 
		{
			System.out.println(str + " is a not palindrome");
		}
	}

}
