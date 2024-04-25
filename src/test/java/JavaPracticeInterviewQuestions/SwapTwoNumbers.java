package JavaPracticeInterviewQuestions;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

//		int a=19,b=43; int temp;
//
//		System.out.println("Before swapping value of a and b are " +  a + " & " + b);
//		temp=a;
//		a=b;
//		b=temp;
//		
//		System.out.println("after swapping value of a and b are " +  a + " & " + b);
//	}
//		int x=76,y=86;
//		x=x+y;
//		y=x-y;
//		x=x-y;
//		
//		System.out.println("after swapping value of a and b are " +  x + " & " + y);
		
		//using *./ operator
//		a=a*b;
//		b=a/b;
//		a=a/b;
		
		
		// reverse a number
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		
		while(num!=0) {
			rev=rev*10 +num%10;
			num=num/10;
			}
		System.out.println(rev);
		
}}
