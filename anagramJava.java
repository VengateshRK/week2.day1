package week2.day1;

import java.util.Arrays;

public class anagramJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare a String 
		String text1 = "stops";
		//Declare another String
		String text2 = "potss";
		
		char[] str1= text1.toCharArray();
		char[] str2= text2.toCharArray();
		
		if (text1.length() == text2.length()) {
			System.out.println("length are equal");
		}
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		
		for (int i = 0 ; i <=str1.length-1 ; i++) {
			
			for (int j = 0 ; j <=str2.length-1 ; j++) {
				
				
				if (str1[i]==str1[j]) {
					System.out.println(str2[j] +" = " + str1[i]);
				}
					
			}
		}
	}
	
}
