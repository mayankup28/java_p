import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement_Left {
	public static long[] nextLargerElement(long arr[], int n) {
		long[] ngr = new long[n];
		
		Stack<Long> st = new Stack<>();
		
		for(int i=0;i<n;i++) {
			long ele = arr[i];
			while(st.size()>0 && st.peek()<=ele) {
				st.pop();
			}
			if(st.size()==0) {
				ngr[i] = -1;
			}else {
				ngr[i] = st.peek();
			}
			st.push(ele);
		}
		return ngr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextLong();
		}
		
		long[] res = nextLargerElement(arr, n);
		for(int i=0;i<n;i++) {
			System.out.print(res[i]+" ");
		}
	}
}
