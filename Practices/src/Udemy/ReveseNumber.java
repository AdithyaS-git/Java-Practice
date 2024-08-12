package Udemy;

import java.util.Scanner;

public class ReveseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc= new Scanner(System.in);
 
 System.out.println("Enter the value : ");
 
 int a = sc.nextInt();//consider a= 2345
 //using algorithm
 
 /*int rev =0;
 
 while(a !=0) {
	 rev=rev*10 + a% 10;//in first step:rev=0*10=2345%10,ie rev=5 ,rev=5*10 +234%10=50+4=54, rev=54*10+23%10=540+3=543, rev=543*10+2=5432
	 a=a/10; //a=2345/10,a=234  ,a =234/10=23 , a=23/10=2,a=2/10=0
 }*/
 
 
 //Using String buffer class
 
// StringBuffer sb =new StringBuffer(String.valueOf(a));
// StringBuffer rev =sb.reverse();
 
 //Using StringBuilder Class
 
 StringBuilder sb = new StringBuilder();
 sb.append(a);
 StringBuilder rev=sb.reverse();
 System.out.println("Reverse Value is : " +rev);
 
	}

}
