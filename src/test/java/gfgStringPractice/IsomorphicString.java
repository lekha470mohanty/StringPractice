package gfgStringPractice;

import java.util.HashMap;

public class IsomorphicString {

	public static void main(String[] args) {
		String str1= "axx";
		String str2= "xxy";
		if(str1.length()!=str2.length()){
            System.out.println("not isomorphic");
            return;
        }
        HashMap<Character, Character> hm= new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch1= str1.charAt(i);
            char ch2= str2.charAt(i);
            
            if(hm.containsKey(ch1)){
                if(hm.get(ch1)!=ch2) {
                	System.out.println("not isomorphic");
                	return;
                }
            }
            else if(hm.containsValue(ch2)){
            	System.out.println("not isomorphic");
            	return;
 
            }
            else{
                hm.put(ch1, ch2);   
            }
        }
        System.out.println("is isomorphic");

	
	}

}
