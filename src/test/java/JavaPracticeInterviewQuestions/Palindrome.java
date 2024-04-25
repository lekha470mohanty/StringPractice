package JavaPracticeInterviewQuestions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number ");
		int a=sc.nextInt();
		//int originalnum=a;
		int rev=0;
		while(a!=0) {
			rev= rev*10+ a%10;
			a=a/10;
		}
		System.out.println(rev);
	}
	//REVERSE A STRING ___PALINDRONE STRING
	//Scanner sc1=new Scanner(System.in);
	String str="asdfghgfdsa";

	
	
	
	

}
