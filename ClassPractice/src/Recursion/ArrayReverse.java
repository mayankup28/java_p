package Recursion;

public class ArrayReverse {
	public static void arrayReverse(int arr[], int idx) {
		if(idx==arr.length) {
			return;
		}
		arrayReverse(arr,idx+1);
		System.out.println(arr[idx]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,6,9,5,4};
		int idx = 0;
		arrayReverse(arr, idx);
	}

}
