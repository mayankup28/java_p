import java.util.Scanner;

public class Three_Consivative {
	
	static void three_consicative_array(int arr[], int num) {
		int count=1;
		for(int i= 0; i<num-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
		}
		System.out.println(count);
		if(count==3) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arrs[] = new int[n];
		for(int i =0; i<=n-1; i++) {
			arrs[i] = sc.nextInt();
		}
		three_consicative_array(arrs, n);
	}

}
