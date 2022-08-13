package String_Practice;

import java.util.Scanner;

public class Pallindrome {
	public static boolean checkPallindrome(String str) {
		int n = str.length();
		int i = 0;
		int j = n-1;
		while(i<j) {
			char charAti = str.charAt(i);
			char charAtj = str.charAt(j);
			if(charAti != charAtj) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);

	        String str=scn.nextLine();
	        boolean res = checkPallindrome(str);
	        if(res == true) {
	        	System.out.print(true);
	        }
	        else {
	        	System.out.print(false);
	        }

	}

}
