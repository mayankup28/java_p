import java.util.Arrays;
import java.util.Scanner;

public class Two_Arrays {
	
	  private static void findClosestPair(int[] arr1, int[] arr2, int tar)
	    {
		  int diff=Integer.MAX_VALUE;

	        int x1=-1;
	        int x2=-1;

	        for(int i=0; i<arr1.length; i++){
	            for(int j=0; j<arr2.length; j++){
	                int csum= arr1[i] + arr2[j];
	                
	                int curr_diff = Math.abs(csum - tar);

	                if(curr_diff < diff){
	                    x1=arr1[i];
	                    x2=arr2[j];

	                    diff=curr_diff;
	                }
	            }
	        }

	        System.out.println(x1+" "+x2);
	    }
	 
	       /// Better code for this................
	  
	  public static void getClosest_better(int[] arr1,int[] arr2, int tar){
	        int diff=Integer.MAX_VALUE;
	        int n2=arr2.length;
	        
	        int x1=-1;
	        int x2=-1;
	        
	        int l=0;
	        int r=n2-1;

	        while(l<arr1.length && r>=0){
	            int csum=arr1[l] + arr2[r];
	            
	            int curr_diff= Math.abs(csum-tar);
	            
	            if(curr_diff < diff){
	                x1=arr1[l];
	                x2=arr2[r];

	                diff=curr_diff;
	            }
	            
	            if(csum>tar){
	                r--;
	            } else {
	                l++;
	            }
	        }
	        
	        System.out.println(x1+" "+x2);
	    }

	 
	       public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int m = sc.nextInt();
	        int arr1[] = new int[m];
	        for(int i=0;i<m;i++){
	            arr1[i]=sc.nextInt();
	        }
	        
	         int n = sc.nextInt();
	        int arr2[] = new int[n];
	        for(int i=0;i<n;i++){
	            arr2[i]=sc.nextInt();
	        }
	        
	        int x = sc.nextInt();
	      findClosestPair(arr1, arr2, x);
	    }
}
//