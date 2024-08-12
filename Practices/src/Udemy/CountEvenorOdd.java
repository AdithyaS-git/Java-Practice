package Udemy;

import java.util.Scanner;

public class CountEvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);

System.out.println("Enter the number : ");
int num =sc.nextInt();
int Evencount=0;
int Oddcount=0;

while(num>0) {
	int rem=num/10;
	
	if( rem % 2 == 0) 
	{
		Evencount++;
		
	}
	else
		Oddcount++;
	
num =num/10;
}


System.out.println("the number of even digits are : "+ Evencount);
System.out.println("the number of odd digits are : "+ Oddcount);
	}

}
