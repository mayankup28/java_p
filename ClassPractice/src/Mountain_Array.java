import java.util.Scanner;

public class Mountain_Array{
	
	static boolean mountain(int arr[],int num) {
		int i=-1;
		if(num<3) return false;
		for(i=1;i<num;i++) {
			if(arr[i-1]>=arr[i]) {
				break;
			}
		}
		if(i==1 || i==num) {
			
			return false;
		}
		for(; i<num; i++) {
			if(arr[i-1]<=arr[i]) {
				return false;
			}
		}
		return true;
		
		
	}
	
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
//    int t = sc.nextInt();
    int[] arrs = new int[n];
    for(int i = 0; i<n; i++){
        arrs[i]=sc.nextInt();
    }
    boolean mountain_array = mountain(arrs, n);
    if(mountain_array){
        System.out.println("Yes it is mountain array");
    } else {
        System.out.println("No it is not mountain array");
    }
  }
	
}
	
