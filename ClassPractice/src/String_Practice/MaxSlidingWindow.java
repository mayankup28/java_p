package String_Practice;

import java.util.Scanner;
import java.util.Stack;

public class MaxSlidingWindow {
	public static int[] maxSliding(int num[],int k) {
		int n = num.length;
		int[] ans = new int[n-k+1];
		//for indices of next greater element
		int[] ngr = new int[n];
		Stack<Integer> st = new Stack<>();
		for(int i=n-1;i>=0;i--) {
			int ele = num[i];
			while(st.size()>0 && num[st.peek()]<=ele) {
				st.pop();
			}
			if(st.size()==0) {
				ngr[i]=n;
			}else {
				ngr[i]=st.peek();
			}
			st.push(i);
		}
		
		int idx=0;
		for(int sp=0;sp<=(n-k);sp++) {
			if(idx<sp) {
				idx = sp;
			}
			int ep = sp+k-1;
			while(ngr[idx]<=ep) {
				idx = ngr[idx];
			}
			ans[sp] = num[idx];
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		int[] res = maxSliding(arr, t);
		for(int i=0;i<n;i++) {
			System.out.print(res[i]+" ");
		}
	}

}
