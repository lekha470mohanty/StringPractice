package JavaPracticeInterviewQuestions;

import java.util.Scanner;

public class MinAndMaxInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		//int max=arr[0];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("***************************************************************** ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max){
				max=arr[i];
			}

		}
		System.out.println("The maximum Number in an Array is : " +max);
		//		Scanner sc=new Scanner(System.in);
		//		int[] arr=new int[4];
		//		int min=Integer.MAX_VALUE;
		//		for(int i=0;i<arr.length;i++) {
		//			arr[i]=sc.nextInt();
		//		}
		//		System.out.println("***************************************************************** ");
		//		for(int i=0;i<arr.length;i++) {
		//			if(arr[i]<min) {
		//				min=arr[i];
		//			}
		//			
		//			}
		//		System.out.println("The minimum Number in an Array is : " + min);
	}

}
