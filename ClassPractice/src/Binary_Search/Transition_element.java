package Binary_Search;

import java.util.Scanner;

public class Transition_element {
	public static void first_oc(int arr[]) {
		int n = arr.length;
		 
		 int left = 0;
		 int right = n-1;
		 
		    int fo=-1;
	          
		 while(left<=right) {
			 int mid = (left + right)/2;
			 if(arr[mid]==1) {
				 fo = mid;
				 right = mid-1;
			 }
			 else if(arr[mid]<1) {
				 left = mid+1;
			 }
			 else {
				 right = mid-1;
			 }
		 }
		 System.out.print(fo);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
        	arr[i] = scn.nextInt();
        }

        first_oc(arr);
        
	}
	
}
