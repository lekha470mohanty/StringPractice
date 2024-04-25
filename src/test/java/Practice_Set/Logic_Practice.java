package Practice_Set;

public class Logic_Practice {

	public static void main(String[] args) {

		//REVERSE STRING
		/*String a="Lekha";
		String rev="";
		int len=a.length();
		System.out.println(len);
      for(int i=len-1;i>=0;i--) {

    	  char ch=a.charAt(i);
    	  rev=rev+ch;*/


		/*
		 * //SWAP TWO STRINGS USING TEMP VARIABLE String x="Good"; String y="Morning";
		 * String temp="";
		 * 
		 * temp=x; x=y; y=temp;
		 * 
		 * System.out.println(x + " " + y);
		 */

		//SWAP TWO integers WITHOUT USING TEMP VARIABLE  

		/*
		 * int a=4; int b=10; a=a+b; b=a-b; a=a-b; System.out.println("Value of a is "+
		 * a + " Value of b is "+ b);
		 */

		//SWAP TWO STRINGS WITHOUT USING TEMP VARIABLE
		String s1="LEKHA";
		String s2="MOHANTY";
		String m= s1.concat(s2);
		System.out.println(m);
		s2 = m.substring(0, m.length() - s2.length());
		s1 = m.substring(s2.length());
		System.out.println(s2);
		System.out.println(s1);

		//FIBONACCI SERIES
		/*
		 * int a1=0; int b1=1; int n=8; System.out.println(a1); System.out.println(b1);
		 * for(int i=2;i<n;i++) { int c1=a1+b1; System.out.println(c1); a1=b1; b1=c1; }
		 */
	}




}
