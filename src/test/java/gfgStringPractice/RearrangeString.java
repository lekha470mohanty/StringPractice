package gfgStringPractice;

import java.util.Arrays;

public class RearrangeString {

	public static void main(String[] args) {
//		String str="SHCN76AHD9SNXK";
//		char[] ch=str.toCharArray();//converting string to array
//		int len=ch.length;
//		int count=0;
//
//		Arrays.sort(ch);//using an in built method in array to sort the array
//		for(char c:ch) {
//			System.out.print(c); //printing elements of array in lexicographical form in dictionary form
//
//		}
//		System.out.println("\t");
//		System.out.println("Length of the array is "+len);
//		for(int i=0;i<len;i++) {
//
//			if(ch[i]>='A'&&ch[i]<='Z') {
//				
//				System.out.print(ch[i]);
//			}else {
//				int num=Character.getNumericValue(ch[i]);
//				count=count+num;
//				
//
//			}
//
//
//		}
//		System.out.println("\t");
//		System.out.println(count);
		String str="ABIK7DCH1";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				int num=Character.getNumericValue(ch);
				sum=sum+num;
			}
		}
		String temp="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isAlphabetic(ch)) {
				temp=temp+ch;
			}
		}
		char[] arr=temp.toCharArray();
		Arrays.sort(arr);
		String temp1=new String(arr);
		temp1=temp1+sum;
		System.out.println(temp1);
		
	}}
