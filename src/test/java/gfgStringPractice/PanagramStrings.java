package gfgStringPractice;

import java.util.HashSet;

public class PanagramStrings {

	public static void main(String[] args) {
		String str="The quick brown fox jumps over the lazy dog";
		str=str.toLowerCase();
		if(str.length()<26) {//first check if its length is less than total alphabets that exist in english i.e 26, then return false
			System.out.println("The string is not panagram");
			return; //to terminate the program
		}
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isAlphabetic(ch)) {
				set.add(ch);
			}
		}
		if(set.size()==26) {
			System.out.println("Is panagram");
		}
		else {
			System.out.println("Not panagram");
			
		}

		
	}

}
