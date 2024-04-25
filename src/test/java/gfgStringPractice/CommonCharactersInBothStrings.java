package gfgStringPractice;

public class CommonCharactersInBothStrings {

	public static void main(String[] args) {
		String str1="lekhhaa";
		String str2="mohhaanty";
		String ans="";
		
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			if(str2.indexOf(ch)==-1) {
				
			}
			else {
				if(ans.indexOf(ch)==-1)
				ans=ans+ch;
			}
		}
		System.out.println(ans);
	}

}
