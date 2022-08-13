package String_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Target_String {
	
	    public static boolean checkTrue(String A, String B){
	    	if (A.equals(B)){ 
	    		return true;
	    	}

	    	char[] h = A.toCharArray();
	    	char[] l = B.toCharArray();

	    	for (int i = 0; i < A.length(); i++) {
	    		char m = h[0]; 
	    		for (int j = 1; j < A.length(); j++) { 
	    			h[j - 1] = h[j];
	    		}
	    		h[A.length() - 1] = m; 
	    		if (Arrays.equals(h, l)){
	    			return true;
	    		}
	    	}

	    	return false;
	    }
	    
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        String t = sc.nextLine();
	        if(checkTrue(s, t)){
	            System.out.print("True");
	        }else{
	            System.out.print("False");
	        }
	    }

}
