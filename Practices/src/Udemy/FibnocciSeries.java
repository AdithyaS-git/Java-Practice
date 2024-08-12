package Udemy;

import java.util.Scanner;

public class FibnocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number : ");
int n1 =sc.nextInt();
System.out.println("Enter the second number : ");
int n2 =sc.nextInt();
int sum=0;

System.out.print(" "+n1+" " +n2);

for(int i=2;i<10;i++) {
	sum=n1+n2;
	System.out.print(" " +sum);
	n1=n2;
	n2=sum;
}

	}

}
