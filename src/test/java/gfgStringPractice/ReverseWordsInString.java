package gfgStringPractice;

public class ReverseWordsInString {

	public static void main(String[] args) {

		//String str="the sky is pink";
		//String str="the$sky$is$pink";
		String str="the.sky.is.pink";
		String rev="";

		//convert the string to array
		String arr[]=str.split("\\.");
		int i=0,j=arr.length-1;
		while(i<j) {
			String temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
		}
		//		System.out.println(arr.length);
		//		System.out.println(arr[1]);
		for(int j1=0;j1<arr.length;j1++) {
			System.out.print(arr[j1]+ ".");
		}


	}}
