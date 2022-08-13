import java.util.Scanner;

public class First_Last_ocurrence {
	
	static void ocurrence(int arr[], int num, int tar) {
		int fo=-1;
		int lo= -1;
		for(int i=0; i<num; i++) {
		if(arr[i]==tar) {
			if(fo == -1) {
				fo = i;
			}
			lo = i;
		}
		}
		System.out.println("first"+"---"+fo);
	
		System.out.println("last"+"---"+lo);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int t = sc.nextInt();
	    int[] arrs = new int[n];
	    for(int i = 0; i<n; i++){
	        arrs[i]=sc.nextInt();
	    }
	    ocurrence(arrs, n, t);
	}

}
