package String_Practice;

import java.util.Scanner;

public class CountSpace {
	
	public static int countSpaces(String str){
	    int n=str.length();
	    int count=0;

	    for(int i=0; i<n; i=i+1){
	        char ch=str.charAt(i);

	        if(ch==' '){
	            count++;
	        }
	    }

	    return count;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scn=new Scanner(System.in);

	        String str=scn.nextLine();
	      int res=  countSpaces(str);
	      System.out.print(res);

	}

}
