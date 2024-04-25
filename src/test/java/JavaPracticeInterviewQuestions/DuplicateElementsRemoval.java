package JavaPracticeInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsRemoval {

	public static void main(String[] args) {
		String ans=duplicateCharRemoval("lleeekkkhhhhaaamm");
		System.out.println(ans);
	
	}
	
//	public static String duplicateCharRemoval(String str) {
//		Set<Character> set=new HashSet<Character>();
//		String str1="";
//		for(int i=0;i<str.length();i++){
//			char ch=str.charAt(i);
//			if(set.contains(ch)) {
//				
//			}
//			else {
//				set.add(ch);
//				str1=str1+ch;
//			}
//		}
//	return str1;	
//	}
	public static String duplicateCharRemoval(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(str1.indexOf(ch)==-1) {
				str1=str1+ch;//l
			}
		}
		return str1;
	}
}