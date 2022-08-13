package String_Practice;

import java.util.Scanner;

public class Making_Substring {
	
		
	public static void generateAllSubstrings_better(String str){
        int n=str.length();

        for(int sp=0; sp<n; sp++){
            String sub="";
            for(int ep=sp; ep<n; ep++){
                sub=sub+str.charAt(ep);
                System.out.print(sub+" ");
                System.out.println();
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);

	        String str=scn.nextLine();
	     generateAllSubstrings_better(str);
	        
	     

	}

}
