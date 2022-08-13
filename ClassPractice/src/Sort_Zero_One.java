import java.util.Scanner;

public class Sort_Zero_One {
	static void swap(int arr[],int i,int j) {
		int temp=0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void sort_array(int arr[],int num) {
		int i=-1;
		int j=0;
		
		while(j<num) {
			if(arr[j]==0) {
				i++;
				swap(arr, i, j);
				j++;
			}
			 
			
			else {
				j++;
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
        sort_array(arrs, n);
        for(int i=0; i<n; i++){
	         System.out.print(arrs[i]+" ");
	     }
	}

}
