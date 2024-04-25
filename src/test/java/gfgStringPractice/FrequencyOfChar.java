package gfgStringPractice;

import java.util.HashMap;

public class FrequencyOfChar {

	public static void main(String[] args) {
		String str="helloo";
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(hm.containsKey(ch)) {
				int count=hm.get(ch);// to get the count
				hm.put(ch, count+1);
			}
			else {
				hm.put(ch, 1);
			}
			
		}
		System.out.println(hm);
	}


}
