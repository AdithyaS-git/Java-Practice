package Udemy;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
 
System.out.println("Enter a number ; ");
 int a = sc.nextInt();
 
 System.out.println("Enter a number ; ");
 int b = sc.nextInt();
 
 System.out.println("Enter a number ; ");
 int c = sc.nextInt();
 
 if(a>b && a>c) {
	 System.out.println("The greatest num is :  " +a);
	
 }
 else if(b>a &&b>c)
 {
	 System.out.println("The greatest num is :  " +b);
 }
 else
	 System.out.println("The greatest num is :  " +c);
 
	}

}
