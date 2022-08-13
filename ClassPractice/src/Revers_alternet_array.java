import java.util.Scanner;

public class Revers_alternet_array {
	static void revers_alternet(int arr[], int num) {
		for(int i = num-1; i>=0;i-=2) {
			System.out.print(arr[i]);
		}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     int[] arrs = new int[n];
	     for(int i=0; i<n; i++) {
	         arrs[i] = sc.nextInt();
	        
	     }
	     revers_alternet(arrs, n);
	       
	}

}
