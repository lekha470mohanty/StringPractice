package JavaPracticeInterviewQuestions;

public class JunkCharacterRemoval {

	public static void main(String[] args) {
		// Using Regular Expression we can remove the junk characters
		String s="@#$$$$$$$#dscjkcndjknfjned389398988838e2eu8923";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
