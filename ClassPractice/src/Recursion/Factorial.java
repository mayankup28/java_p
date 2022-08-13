package Recursion;

import java.util.Scanner;

public class Factorial {
	public static int fac(int n) {
		if(n==0) return 1;
		int f = fac(n-1);
		int ans = f*n;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scn=new Scanner(System.in);

	       int n = scn.nextInt();
	         int res = fac(n);
	         System.out.println(res);
	        
	}

}
