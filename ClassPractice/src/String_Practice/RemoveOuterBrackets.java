package String_Practice;

import java.util.Scanner;

public class RemoveOuterBrackets {
	public static String removeBracket(String str) {
		String ans = "";
		int a = 0;
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='(') {
				if(a!=0) {
					ans+=ch;
				}
				a++;
			}else {
				if(a!=1) {
					ans+=ch;
				}
				a--;
			}
			
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		String  res = removeBracket(str);
		
			System.out.print(res);
	

	}

}
