package gfgStringPractice;

public class MinimumIndexedCharacter {

	public static void main(String[] args) {
		String str1="gieeksforgeeks";
		String str2="siet";
		char ch1 = 0;
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			if(str2.indexOf(ch)!=-1) {
				ch1=ch;
				break;
			}
			
		}
		System.out.println(ch1);
	}

}
