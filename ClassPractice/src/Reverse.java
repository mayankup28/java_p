import java.util.Scanner;

public class Reverse {
	 static void reverse_array(int arr[], int num) {
		for(int i=0; i<num/2; i++) {
			int temp = arr[i];
			arr[i] = arr[num-1-i];
			arr[num-1-i] = temp;
		}
		
	}
	
	  
		// TODO Auto-generated method stub
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int[] arrs = new int[n];
	 for(int i=0; i<n; i++) {
		 arrs[i] = sc.nextInt();
		
	 }
	 System.out.println("Before reversing the array");
     
     for(int i=0; i<n; i++){
    	 
         System.out.print(arrs[i]+" ");
         
     }
	 reverse_array(arrs, n);
	 System.out.println("After reversing the array");
     
     for(int i=0; i<n; i++){
         System.out.print(arrs[i]+" ");
     }

	}


}
