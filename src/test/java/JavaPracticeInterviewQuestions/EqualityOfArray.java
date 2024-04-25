package JavaPracticeInterviewQuestions;

import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {
		int[] a= {4,3,8,6,5};
		int[] b= {4,3,5,6,8};
		if (a.length==b.length) {
			System.out.println("The length of both the arrays are equal.");
		}
		else 
		{
			System.out.println("The length of both the arrays are not equal.");
			return;

		}
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println("abc");
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				System.out.println("Arrays are not Equal.");
				break;
			}
		}
	}
}
