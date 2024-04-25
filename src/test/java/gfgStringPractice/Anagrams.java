package gfgStringPractice;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
//		String str1="Race";
//		String str2="carej";
//		str1=str1.toLowerCase();
//		str2=str2.toLowerCase();
//		
//		char[] ch1=str1.toCharArray();
//		char[] ch2=str2.toCharArray();
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		
//		boolean res= Arrays.equals(ch1, ch2);
//		if(res) {
//			System.out.println("is Anagram");
//		}
//		else {
//			System.out.println("is not anangram");
//		}
		String str1= "raace";
		String str2= "caare";
		int arr[]= new int [26];
		boolean ans= true;
		// a  97  arr[]
		if(str1.length()!=str2.length()) {
			System.out.println("Not Anagram");
			return;
		}
		
		for(int i=0;i<str1.length();i++) {
			char ch= str1.charAt(i);
			int index= ch-97;
			arr[index]++;
		}
		for(int i=0;i<str2.length();i++){
			char ch= str2.charAt(i);
			int index= ch-97;
			arr[index]--;
		}
		
		for(int i=0;i<26;i++) {
			if(arr[i]!=0) {
				ans= false;
				break;
			}
		}
		
		System.out.println(ans);
	}

}
