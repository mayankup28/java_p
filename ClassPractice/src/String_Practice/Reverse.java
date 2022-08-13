package String_Practice;

import java.util.Scanner;

public class Reverse {
	public static String reverse(String s){
        String ans="";
        int n=s.length();

        for(int i=n-1; i>=0; i--){
            ans=ans+s.charAt(i);
        }

        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);

	        String str=scn.nextLine();
	        String res = reverse(str);
	        System.out.print(res);
	}

}
