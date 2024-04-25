package JavaPracticeInterviewQuestions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		//Reverse number using StringBuffer class
		Scanner sc1=new Scanner(System.in);
		int num1=sc1.nextInt();
		
		StringBuffer sb=new StringBuffer(String.valueOf(num1));
		
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
	}

}
