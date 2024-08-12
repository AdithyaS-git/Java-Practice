package Udemy;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the word: ");
		String word =sc.next();
		
		String rev ="";
		String org_word =word;
		int len = word.length();
		 for(int i =len-1;i>=0;i--) {
			 rev=rev+word.charAt(i);
		 }
		 System.out.println("The reverse word is : "+rev);
		 
		 if(org_word.equals(rev)) {
			 System.out.println("The word is palindrome and the word is : " + org_word);
		 }
		 else
			 System.out.println("The word is not a palindrome and the reverse word is : " +rev);
			 
	}

}
