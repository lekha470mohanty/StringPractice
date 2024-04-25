package gfgStringPractice;

import java.util.HashMap;

public class MaxFrequencyOrCharacters {

	public static void main(String[] args) {
		String str="aabbccdddd";
		
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
		int max=Integer.MIN_VALUE;
		char ans=0;
		for(char ch:hm.keySet()) {
			int num=hm.get(ch);//returns value of hashmap
			//max=Math.max(max, num);
			if(max<num) {
				max=num;
				ans=ch;
			}
			
		}
		System.out.println(max);
		System.out.println(ans);
	}

}
