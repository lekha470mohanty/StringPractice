package JavaPracticeInterviewQuestions;
import java.util.Scanner;
public class SumOfDigitInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//int arr[]= {5,6,7,8,9,8,44};
		int arr[]=new int[7];
		for(int j=0;j<arr.length;j++) {
			
			arr[j]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+ arr[i];
		}
		
		System.out.println("Sum of digits of Array: " + sum);
	}

}
