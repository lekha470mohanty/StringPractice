package gfgStringPractice;

import java.util.HashSet;

public class UniqueCharacters {

	public static void main(String[] args) {
		//WAP TO COMPARE TWO DIFF STRINGS AND STORE THE UNIQUE CHARACTERES IN A DIFF STRINGS
		String str1="lekha";
		String str2="mohanty";
		String m=str1.concat(str2);
		String n="";
		
		HashSet<Character> hs=new HashSet<>();
		for(int i=0;i<m.length();i++) {
			char ch=m.charAt(i);
			if(hs.contains(ch)) {
				
			}
			else {
				hs.add(ch);
				n+=ch;
				
			}
		}
		System.out.println(n);
	}

}
