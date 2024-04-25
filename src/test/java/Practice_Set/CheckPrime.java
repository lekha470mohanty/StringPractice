package Practice_Set;

public class CheckPrime {

	public static void main(String[] args) {
	
		checkPrime(9);

	}

	public static boolean checkPrime(int num) {
		if( num<=1)
		return false;
		for(int i=2;i<num;i++) {
			int remainder=num%i;
			if(remainder==0) return false;
		
		}
		return true;
	
	}

}
