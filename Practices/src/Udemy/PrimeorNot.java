package Udemy;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);

System.out.println("Enter a number : ");
int num =sc.nextInt();

int count=0;
if(num >1) {
	
	for(int i=1;i<=num;i++) {
		if(num%i==0)
			count++;
	}
	if(count ==2)
		System.out.println("Number is prime");
	else
		System.out.println("Number is  not a prime");
} 
else
	System.out.println("Neither prime nor not a prime");
	}

}
