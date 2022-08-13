import java.util.Scanner;

public class Sort_Zero_num {
		static void zero_to_num(int arr[],int num) {
			
			for (int j = 0; j < num-1; j++) {
				 
	            
	            if (arr[j] > arr[j + 1]) {
	 
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	 
	                j = -1;
	            }
	        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrs = new int[n];
        for(int i=0; i<n; i++){
            arrs[i]=sc.nextInt();
        }
        zero_to_num(arrs, n);
        
        for(int i=0; i<n; i++){
	         System.out.print(arrs[i]+" ");
	     }
	}

}
