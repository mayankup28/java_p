package Recursion;

import java.util.Scanner;

public class PowerClaculation {
	public static int power(int a,int b) {
		if(b==0) return 1;
		
		int f= power(a,b-1);
		
		int ans = a*f;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);

	       int a = scn.nextInt();
	       int b = scn.nextInt();
	         int res = power(a,b);
	         System.out.println(res);
	}

}
