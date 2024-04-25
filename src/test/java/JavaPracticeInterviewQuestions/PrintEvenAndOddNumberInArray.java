package JavaPracticeInterviewQuestions;

import java.util.Scanner;

public class PrintEvenAndOddNumberInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("The Number is Even " + arr[i]);
			}
			else {
				System.out.println("The Number is odd " + arr[i]);
			}
		}
	}

}
