package Array;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int a[]= {12,14,13,17,18};

//for(int i=0;i<=a.length;i++) {
//	if(a[i]%2 == 0) 
//		System.out.println(a[i]);
//	
//	
//}

for(int value:a) {
	if(value % 2==0)
		System.out.println(value);
}
System.out.println("odd number");
//for(int i=0;i<=a.length;i++) {
//	if(a[i]%2 !=0) {
//		System.out.println(a[i]);
//	}
//	
//}
for(int value:a) {
	if(value % 2!=0)
		System.out.println(value);
}
		
		
		
	}

}
