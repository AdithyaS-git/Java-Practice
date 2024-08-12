package Udemy;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		String a = sc.next();
		String rev ="";
		// 1.Using String concatenation operator
		
//		int len=a.length();
//		 for(int i =len-1 ;i>=0;i--) {
//			 rev =rev+a.charAt(i);
//		 }
		
		//Using character array
		
		char b[]=a.toCharArray();
		int len =b.length;
		
		for(int i = len-1; i>=0; i--) {
			rev=rev+b[i];
		}
		 System.out.println("Reverse value is ; " +rev);
	}

}
