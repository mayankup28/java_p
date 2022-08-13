import java.util.Scanner;

public class Milk_Water {
	static void milk_and_water(int arr[],int num) {
		int k=0;
		int[] a = new int[num];
		for(int i=0; i<num;i++) {
			if(arr[i]<0) {
				a[k]=arr[i];
				k++;
			}
			
		}
			
		for(int i=a[k];i<num;i++) {
			if(arr[i]>0) {
				a[k]=arr[i];
				k++;
			}
		}
		
		for(int i=0;i<num;i++) {
			arr[i]=a[i];
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
        milk_and_water(arrs, n);
        System.out.println("After left roteting the array");
	     
	     for(int i=0; i<n; i++){
	         System.out.print(arrs[i]+" ");
	     }
	}

}
