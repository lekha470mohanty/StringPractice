package gfgStringPractice;

import java.util.HashMap;

public class TwiceCounter {

	public static void main(String[] args) {
		String[] str = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa","aaa","bbb","ccc"};
		HashMap<String,Integer> hm=new HashMap<>();
		for(int i=0;i<str.length;i++) {
			String s=str[i];
			if(hm.containsKey(s)) {
				int count=hm.get(s);
				hm.put(s, count+1);
			}
			else {
				hm.put(s, 1);
			}
		}
		System.out.println(hm);
		int count=0;
		for(String s:hm.keySet()) {
			int num=hm.get(s);
			if(num==2) {
				count++;
			}
			
		}
		System.out.println(count);
	}
	

}
