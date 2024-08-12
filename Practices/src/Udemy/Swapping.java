package Udemy;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 20,b = 10;
		
		System.out.println("before Swapping :  a = " +a+ " b= " +b);
//logic 1
//int c = a;
//		a=b;
//	b=c;
//	System.out.println("After Swapping :  a = " +a+ " b= " +b);
//		
//		logic 2
//		
//		a= a+b;20+10=30;
//	
//		b=a-b; 30-10=20
//		a=a-b; 30-20=10
//		
//		  Logic 3:if a and b are non zeroes,then we can apply multiplication and division method
//		
//		a = a*b; 20*10=200
//		b =a/b	;	200/10=20
//	a= a/b;	200/20=10
		
		//Logic 4: Bitwise XOR(^)
		a=a^b;
		b =a^b;
		a=a^b;
		System.out.println("After Swapping :  a = " +a+ " b= " +b);
	}

}
