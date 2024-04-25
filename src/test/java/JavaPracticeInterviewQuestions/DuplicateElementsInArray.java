package JavaPracticeInterviewQuestions;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		//Scanner sc =new Scanner(System.in);
		String str[]= {"python","ruby","codein","ruby","playwright","java","javascript","java"};
		int ans=0;
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
				
					System.out.println("The Duplicate element is : " + str[j]);
				}
			}
		}

	}

}
