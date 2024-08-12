package Udemy;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter a Number : ");
int num = sc.nextInt();

int org_num =num;

int rev = 0;
 while ( num != 0) {
	 rev =rev*10 + num %10;
	 num=num/10;
 }
 
 System.out.println("Reverse num is : " +rev);
if(org_num == rev) {
	System.out.println("The number is a Palindrome number and number is : " + org_num);
	
}
else
	System.out.println("Number is not palindrome and the reverse value is : " + rev);
	
	}

}
