package String_Practice;

import java.util.Scanner;

public class Diffrence_Sstring {
	  public static char differenceInString(String str1, String str2){        
	        int sum1 = 0;
	        int sum2 = 0;
	        int i=0;
	        for(; i<str1.length(); i++) {
	            sum1 += str1.charAt(i);
	            sum2 += str2.charAt(i);
	        }

	        System.out.println(str2.charAt(i));
	        sum2 += str2.charAt(i);


	        int intChar = sum2 - sum1;       
	        return (char)intChar;
	    
	    }

	    public static void main(String[] args) {
	       Scanner scn=new Scanner(System.in);
	        String str1=scn.nextLine();
	        String str2=scn.nextLine();
	        char res = differenceInString(str1, str2);
	        System.out.println(res);
	    }
}
