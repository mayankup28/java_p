package String_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Power_of_a_String {
	
	public static int powerOfString(String str) {
		
		int n=str.length();
	    int[] fre1=new int[n];
	    for(int i=0;i<n;i++) {
	    	 char ch=str.charAt(i);

	            int idx=ch-'a';
	            fre1[idx]++;
	           
	    }
	    for(int i=0;i<n;i++) {
	    	System.out.print(fre1[i]);
	    }
	    System.out.println();
	    System.out.print(fre1.length);
	    Arrays.sort(fre1);
		return fre1[n-2];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int res = powerOfString(str);
		System.out.println(res);

	}

}
