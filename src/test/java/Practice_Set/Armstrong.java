package Practice_Set;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		 * int num=371,originalnum,remainder,result=0; originalnum=num;
		 * while(originalnum!=0) { remainder=originalnum % 10;
		 * result+=Math.pow(remainder, 3); originalnum/=10;
		 * 
		 * } if(result==num) { System.out.println(num + " is an Armstrong number. "); }
		 * else { System.out.println(num + " is not an Armstrong number. "); }
		 */

		//Write a Java Program to print the sum of digits of a given integer.
		
		int n=249,newn,sum=0,rem;
		newn=n;
		
		while(newn!=0) {
			rem=newn%10;
			sum+=rem;
			newn/=10;
		}
		System.out.println(sum);
		
}}


