package Udemy;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
int num =sc.nextInt();

int sum = 0;

while(num>0) {
	sum=sum + num%10;
	num=num/10;
}
System.out.println("Sum of digits is : " +sum);
	}

}
