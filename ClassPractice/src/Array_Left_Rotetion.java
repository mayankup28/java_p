import java.util.Scanner;

public class Array_Left_Rotetion {
	
	public static void left_rotet(int arr[], int n, int d) {
		if(d>n) {
			d=d%n;
		}
		int a[]=new int[n];
        int k=0;
        for(int i=d;i<n;i++ ){
            a[k]=arr[i];
//            System.out.println(a[k]+"---"+k);
            k++;
        }
        for(int i=0;i<d;i++){
            a[k]=arr[i];
//            System.out.println(a[k]+"---"+k);
            k++; 
        }
        for(int i=0;i<n;i++){
        arr[i]=a[i];
//        System.out.println(a[i]+"---"+i);
        }
		
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int tar = scn.nextInt();
		int[] arrs = new int[n];
		for(int i=0; i<n; i++) {
			arrs[i] = scn.nextInt();
		}
		System.out.println("Before left roteting the array");
	     
	     for(int i=0; i<n; i++){
	    	 
	         System.out.print(arrs[i]+" "); 
	     }
	     System.out.println();
	     
		left_rotet(arrs, n, tar);
		
		System.out.println("After left roteting the array");
	     
	     for(int i=0; i<n; i++){
	         System.out.print(arrs[i]+" ");
	     }
		
	}
	
}
