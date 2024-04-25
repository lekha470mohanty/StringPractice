package JavaPracticeInterviewQuestions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="Rajce";
		String str2="Care";
		
		
		//convert the string to lower case
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();	
		
		//convert the strings to array of characters
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		
		//sort both the arrays
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean result=Arrays.equals(ch1, ch2);
		
		if(result) {
			System.out.println(str1 + " and " + str2 + " are anagram.");
		}
		
		else {
			System.out.println(str1 + " and " + str2 + " are not anagram.");
		}
	}

}
