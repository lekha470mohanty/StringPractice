package gfgStringPractice;

public class SameCharactersInTwoStrings {

	public static void main(String[] args) {
			String A = "choiciei" ;
			String B = "chancEi";
			A=A.toLowerCase();
			B=B.toLowerCase();
			int count=0;
			if(A.length()!=B.length()) {
				System.out.println("String length not equal");
				return;
			}
			for(int i=0;i<A.length();i++) {
				char ch1=A.charAt(i);
				char ch2=B.charAt(i);
				if(ch1==ch2) {
					count++;
					//count=count+ch1;
					
			}
	}
			System.out.println(count);
			
}}
