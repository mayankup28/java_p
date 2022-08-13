import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Solution{

    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long max=arr[0];
       long temp=arr[0];
       for(int i=1;i<n;i++){
          // System.out.println(a);
           temp+=arr[i];
           if(temp<arr[i]){
               temp=arr[i];
           }
           if(temp>max){
               max=temp;
           }
       }
       return max;
    }
}

//public class Soluyion {
//		// TODO Auto-generated method stub
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();
//			int tar = sc.nextInt();
//		    int i;
//		    int[] arr = new int[num];
//		    for(i = 0; i<num-1; i++) {
//		    	arr[i] = sc.nextInt();
//		    }
//		    for(int j=0; j<num-1; j++) {
//		    	if(tar==arr[j]) {
//		    		System.out.println(j);
//		    	}
//		    	else {
//		    		System.out.println("-1");
//		    	}
//		    	
//		    }
//		for(i=0; i<=num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println(arr[i]);
////		 int v = a[i];
////		for(i = 0; i<num; i++) {
////			if(i==)
////		}
//		
//
////		for(i =0; i<num; i++){
////		    arr[i] = sc.nextInt(); 
////		}
////		
////		int v = arr[i];
////		for(i =0; i<num; i++){
////		  if(v%2==0){
////		      k= k+v;
////		  }
////		  else{
////		      e = e+v;
////
////		  }
////		}
////		System.out.println("Sum of all even numbers"+k);
////		System.out.println("Sum of all odd numbers"+e);
////		    
////
////		

//	}
//
//}
