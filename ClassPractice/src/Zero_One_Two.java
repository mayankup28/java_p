import java.util.Scanner;

public class Zero_One_Two {
	
	static void zero_to_two(int arr[],int n) {
//		(0,p1)-->0
//		(p1+1,p2-1)-->one
//		(p2,p3)-->unknown
//		(p3+1,n-1)-->two
		int p1=-1;
		int p2=0;
		int p3=n-1;
		while(p2<=p3) {
			if(arr[p2]==0) {
				p1++;
				swap(arr,p1,p2);
				p2++;
			}
			else if(arr[p2]==2) {
				swap(arr,p2,p3);
				p3--;
			}
			else {
				p2++;
			}
		}
	}
	static void swap(int arr[],int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrs = new int[n];
        for(int i=0; i<n; i++){
            arrs[i]=sc.nextInt();
        }
        zero_to_two(arrs, n);
        for(int i=0; i<n; i++){
	         System.out.print(arrs[i]+" ");
	     }

	}

}
