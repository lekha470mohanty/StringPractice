package Practice_Set;

public class CountOfChar {

	public static void main(String[] args) {
		String str="lekh27333dfcgvbhjASD87FGHJKnm,";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z' ) 
			{
				count++;
			}
			if(ch>='a' && ch<='z' ) 
			{
				count ++;
			}
		
		}
		System.out.println(count);
	}
	
}
