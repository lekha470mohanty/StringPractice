package strings;

import java.util.Scanner;

public class PrintVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String str=sc.nextLine();
		str=str.toLowerCase();
		System.out.println(str);
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				System.out.println(""+str.charAt(i));
			}
		}
	}

}
