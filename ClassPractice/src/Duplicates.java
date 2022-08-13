import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Duplicates {
	public static boolean Duplicates_Arrays(int arr[], int num) {
		Arrays.sort(arr);
		for(int i=0;i<num-1;i++) {
			if(arr[i]==arr[i+1]) {
				return true;
			}
		}
		return false;	
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrs = new int[n];
		for(int i =0;i<n; i++) {
			arrs[i]=sc.nextInt();
		}
		Duplicates_Arrays(arrs, n);
	}

}
