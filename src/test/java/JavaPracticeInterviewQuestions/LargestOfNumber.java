package JavaPracticeInterviewQuestions;
import java.util.Scanner;


public class LargestOfNumber {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a=sc.nextInt();
		System.out.println("Enter the second number : ");
		int b=sc.nextInt();
		System.out.println("Enter the third number : ");
		int c=sc.nextInt();
//		
//		if (a>b && a>c) {
//			System.out.println(a+ " is the largest number");
//		}
//		else if (b>c && b>a) {
//			System.out.println(b+ " is the largest number");
//		}
//		else {
//			System.out.println(c+ " is the largest number");
//		}
		//Using Ternary operator
		int larger=a>b?a:b;
		//int largest=larger>c?larger:c;
		int largest = (a>b?a:b)>c?(a>b?a:b):c;
		
		System.out.println("The largest of 2 number is "+ largest);
		
	}

}
