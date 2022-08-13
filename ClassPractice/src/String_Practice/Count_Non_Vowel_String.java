package String_Practice;

import java.util.Scanner;

public class Count_Non_Vowel_String {
	
	     public static boolean isVowel(char ch){
	        if(ch=='a' || ch=='e' || ch=='i' || ch=='u' || ch=='o'){
	            return true;
	        }

	        return false;
	    }
	 public static int countSubstringsWithoutVowel(String str){
	        int n=str.length();

	        int count=0;

	        for(int sp=0; sp<n; sp++){
	            for(int ep=sp; ep<n; ep++){
	                char ch=str.charAt(ep);

	                if(isVowel(ch)){
	                    break;
	                }
	                count++;
	            }
	        }

	        return count;
	    }
	    public static void main(String[] args) {
	        Scanner scn=new Scanner(System.in);

	        String str=scn.nextLine();

	        int ans=countSubstringsWithoutVowel(str);
	        System.out.println(ans);
	    }
}
