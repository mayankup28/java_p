package Recursion;

public class PrintArray {
	public static void printArray(int arr[],int idx) {
		if(idx==arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		printArray(arr,idx+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,6,9,5,4};
		int idx = 0;
		printArray(arr, idx);
	}

}
