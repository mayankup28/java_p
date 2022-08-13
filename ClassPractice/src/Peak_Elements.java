import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Peak_Elements {
	static void peek_ele(int arr[], int num){
        for(int i=1;i<num-1;i++){
        	 
            if(arr[i-1] < arr[i] && arr[i+1]<arr[i]){
                System.out.println(arr[i]+" ");
                
            }
            
        }
    }
	

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrs = new int[n];
        for(int i = 0; i<n; i++){
            arrs[i]=sc.nextInt();
        }
         peek_ele(arrs,n);
        
       
    }
}
