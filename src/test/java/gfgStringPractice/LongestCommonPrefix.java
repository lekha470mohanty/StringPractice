package gfgStringPractice;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			String str= arr[i];
			smallest= Math.min(smallest, str.length());        //13 5 4 4
		}
		
		String ans="";         // arr[0]= "geeksforgeeks"
		for(int i=0;i<smallest;i++) {
			char ch= arr[0].charAt(i);
			boolean res= true;
			for(int j=1;j<arr.length;j++) {
				char ch1= arr[j].charAt(i);
				if(ch1!=ch) {
					res= false;
					break;
				}
			}
			if(!res) {
				System.out.println(ans);
				return;
			}
			ans+=ch;
		}
		
		System.out.println(ans);
	

	}

}
