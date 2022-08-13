package Binary_Search;

import java.util.Scanner;

public class First_Last_Index {
	
	 public static void firstLastIndex(int[] arr, int tar) {
		 int n = arr.length;
		 
		 int left = 0;
		 int right = n-1;
		 
		    int fo=-1;
	        int lo=-1;
		 
		 while(left<=right) {
			 int mid = (left + right)/2;
			 if(arr[mid]==tar) {
				 fo = mid;
				 right = mid-1;
			 }
			 else if(arr[mid]<tar) {
				 left = mid+1;
			 }
			 else {
				 right = mid-1;
			 }
		 }
		 left =0;
		 right = n-1;
		 while(left<=right) {
			 int mid = (left + right)/2;
			 if(arr[mid]==tar) {
				 lo = mid;
				 left = mid + 1;
			 }
			 else if(arr[mid]<tar) {
				 left = mid + 1;
			 }
			 else {
				 right = mid - 1;
			 }
		 }
		 System.out.print(fo + " "+lo);
	 }
	 public static void main(String[] args) {
	        Scanner scn=new Scanner(System.in);
	        int n = scn.nextInt();
	        
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++) {
	        	arr[i] = scn.nextInt();
	        }
	        System.out.println("target");
	        int tar = scn.nextInt();
	        firstLastIndex(arr, tar);
	 }  
	        
	      
}
