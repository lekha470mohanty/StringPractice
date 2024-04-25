package gfgStringPractice;

import java.util.HashMap;

public class RomanToIntegers {

	public static void main(String[] args) {
		String str="IX";  //9
		HashMap<Character, Integer> hm= new HashMap<>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		
		int prev= hm.get(str.charAt(0));
		int ans= prev;  //1
		
		for(int i=1;i<str.length();i++) {
			char ch= str.charAt(i);
			int curr= hm.get(ch);
			ans+=curr;  // 1+10= 11
			
			if(curr>prev) {
				ans= ans- 2*prev;   // 9
			}
			prev=curr;
		}
		System.out.println(ans);

	}

}
