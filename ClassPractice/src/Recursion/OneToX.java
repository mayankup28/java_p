package Recursion;

import java.util.Scanner;

public class OneToX {
	public static void print1_n(int n) {
		if(n==1) {
			System.out.println(n);
			return ;
		}
		
		print1_n(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

       int n = scn.nextInt();
         print1_n(n);
        
}
}
