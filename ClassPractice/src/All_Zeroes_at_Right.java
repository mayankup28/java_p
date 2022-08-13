import java.util.Scanner;

public class All_Zeroes_at_Right {
	public static void zeroAtRight(int arr[], int n) {
		int k =0;
		int[] sw = new int[n];
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				sw[k] = arr[i];
				k++;
			}
			
		}
		for(int i=0;i<n;i++) {
			if(arr[i] ==0) {
				sw[k] = arr[i];
				k++;
			}
			
		}
		for(int i=0;i<n;i++){
	       arr[i] = sw[i];
	        }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		for(int i=0;i<num;i++) {
			a[i] = sc.nextInt();
		}
		zeroAtRight(a, num);
		for(int i= 0;i<num;i++) {
			System.out.print(a[i]);
		}

	}

}
//int i=0;
//int j=n-1;
//while(i<j) {
//	 if(arr[i]==0 && arr[j]==0) {
//		 j--;
//	 }
//	if(arr[i]==0) {
//		int temp = arr[j];
//		arr[j] = arr[i];
//		arr[i]= temp;
//		i++;
//		j--;
//	}
//	
//	 else {
//		 i++;
//	 }
//}