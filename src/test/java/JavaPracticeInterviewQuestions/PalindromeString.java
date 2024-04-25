package JavaPracticeInterviewQuestions;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			char ch=str.charAt(i);
			rev+=ch;
		}
		System.out.println("The palindrome string after reversal is  "+rev);
	}

}
