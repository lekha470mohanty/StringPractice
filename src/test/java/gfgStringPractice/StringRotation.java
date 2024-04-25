package gfgStringPractice;

public class StringRotation {

	public static void main(String[] args) {
		String str="lekha";//
		String str2="alekh";//halek, khale
		if(str.length()!=str2.length()) {
			System.out.println("not rotation");
			return;
		}
		str=str+str;// output: lekhalekha
		
		if(str.contains(str2)) {
			System.out.println("yes rotation");
		}
		else {
			System.out.println("Not rotation");
		}

	}

}
