import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Max_min {
	public static int max(int arr[],int num) {
		int m=Integer.MIN_VALUE;    
		for(int i =0; i<num; i++) {
			if(arr[i]>=m) {
				m = arr[i];
			}
		}
		return m;
		
	}
	public static int min_array(int arr[], int num) {
		int mi = Integer.MAX_VALUE;
		for(int i=0; i<num;i++) {
			if(arr[i]<=mi) {
				mi = arr[i];
			}
		}
		return mi;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0; i<n;i++) {
		arr[i] = sc.nextInt();
	}
	int minmum= max(arr,n);

	
	int mii = min_array(arr, n);
	int res  =Math.abs( minmum - mii);
	System.out.println(res);
	}

}
 