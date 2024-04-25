package gfgStringPractice;

import java.util.HashMap;

public class SecondMostRepeatedString {

	public static void main(String[] args) {
		String[] str = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa","aaa","bbb"};
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
		String str1="";
		int max=Integer.MIN_VALUE;
		int secondmax=0;// -1,-2 kuch v 
		String str2="";
		
		for(String s:hm.keySet()) {
			int num=hm.get(s);
			if(num>max) { //num=7,max=5,secondmax=3
				secondmax=max;
				max=num;
				str2=str1;
				str1=s;
			}
			else if(num>secondmax) {
				secondmax=num;
				str2=s;
			}
		}
		System.out.println("The maximum occurance of string  "+str1 +" is "+ max);
		System.out.println("The Second maximum occurance of string  "+ str2 +" is "+ secondmax);
	}

}




