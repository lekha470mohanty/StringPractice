package gfgStringPractice;

import java.util.HashMap;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		String str="zyxnemishhsinha";
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(hm.containsKey(ch)) {
				int count=hm.get(ch);
				hm.put(ch, count+1);
			}
			else {
				hm.put(ch, 1);
			}

		}
		System.out.println(hm);
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(hm.get(ch)!=1) {
				System.out.println("First Repeating character is "+ch);
				break;
			}
		}


	}

}
