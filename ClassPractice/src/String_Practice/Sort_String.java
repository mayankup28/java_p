package String_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_String {
	
	public static String sortString(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		 String string = new String(arr);
		return string;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scn=new Scanner(System.in);

        String str=scn.nextLine();
        String res = sortString(str);
        System.out.print(res);
	}

}
