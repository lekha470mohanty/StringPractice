package JavaPracticeInterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		String str="GoodMorningBengaluru";
		String rev="";
		int n=str.length();
		System.out.println(n);
		for(int i=n-1;i>=0;i--) {
			char ch=str.charAt(i);
			rev+=ch;
		}
		System.out.println(" Value of string after reversing it is "+ rev);
	}

}
