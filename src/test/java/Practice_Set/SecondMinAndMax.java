package Practice_Set;

public class SecondMinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		int arr[]= {1,2,3,4,6,7,88,99,73,29};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<secondMin && arr[i]>min) {
				secondMin=arr[i];
			}
			if(arr[i]>secondMax && arr[i]<max) {
				secondMax=arr[i];
			}
		}
		System.out.println(secondMin);
		System.out.println(secondMax);
	}

}
