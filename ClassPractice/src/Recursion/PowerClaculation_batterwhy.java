package Recursion;

import java.util.Scanner;

public class PowerClaculation_batterwhy {
	public static int batterWhy(int a,int b) {
		if(b==0) return 1;
		int f = batterWhy(a,b/2);
		int ans = f*f;
		if(b%2==1) {
			ans = a*ans;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				 Scanner scn=new Scanner(System.in);

			       int a = scn.nextInt();
			       int b = scn.nextInt();
			         int res = batterWhy(a,b);
			         System.out.println(res);
	}

}
