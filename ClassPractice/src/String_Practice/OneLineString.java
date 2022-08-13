package String_Practice;

import java.util.Scanner;

public class OneLineString {
	public static String ideal_oneline_string(String str) {
		String ans = "";
		char ch = str.charAt(0);
		if('a'<=ch && ch<='z') {
			ch =Character.toUpperCase(ch);
		}
		ans = ans + ch;
		for(int i=1;i<str.length();i++) {
			ch = str.charAt(i);
			if('A'<=ch && ch<='Z') {
				ch = Character.toLowerCase(ch);
			}
			ans = ans + ch;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String strs = sc.nextLine();
		
		String[] arr = strs.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			 	String st = arr[i];
			 	String res =ideal_oneline_string(st);
				System.out.print(res+" ");
			 	
		}
		

	}

}
