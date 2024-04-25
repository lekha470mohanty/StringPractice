package gfgStringPractice;

public class StringRotatedByTwoPlaces {

	public static void main(String[] args) {
				String str1="geeksforgeeks";//onamaz
				//a = amazon
				//b = azonam
				int len=str1.length();
				String str2="geeksgeeksfor";
			    String firstPossibility=str1.substring(len-2,len)+str1.substring(0,len-2);//anticlockwise
			    System.out.println(firstPossibility);
			    String secondPossibility=str1.substring(len-4,len)+str1.substring(0,len-4);
			    System.out.println(secondPossibility);
			    
			    if(firstPossibility.equals(str2)||secondPossibility.equals(str2)) {
			    	System.out.println("String is Rotated By Two Places");
			    }
			    else {
			    	System.out.println("Not in rotation by two places");
			    }
				
				
				
				


	}
}


