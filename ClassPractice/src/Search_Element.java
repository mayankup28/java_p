import java.util.Scanner;

public class Search_Element {

	static void search_element(int arr[], int num, int tar){
        for(int i=0;i<num-1;i++){
            if(arr[i]==tar){
                System.out.print(i);
            }
            
        }
       
           
        
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int t = sc.nextInt();
         int[] arrs = new int[n];
         for(int i=0; i<n; i++) {
             arrs[i] = sc.nextInt();
         }
         search_element(arrs,n,t);
    }

}
