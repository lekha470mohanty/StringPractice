package JavaPracticeInterviewQuestions;

import java.util.Scanner;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Please enter the number: ");
//		int num=sc.nextInt();
		int num=234574645;
		int odd_count=0;
		int even_count=0;
		
		while(num!=0) {
			int rem=num%10;  ////to get the last diogits
			if(rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			num=num/10;
	
		}
		System.out.println("The even disits are : " + even_count);
		System.out.println("The odd disits are : " + odd_count);
}}
