package week2.day1;

public class palindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "madam";
		
		char[] charArr = str.toCharArray();
		
		for (int i=charArr.length -1; i >=0; i--) {
			char rev = charArr[i];
			System.out.print("" +rev);
			
		}
		
		
	}

}
