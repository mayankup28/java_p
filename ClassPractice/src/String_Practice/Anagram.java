package String_Practice;

import java.util.Scanner;

public class Anagram {
	 public static boolean checkAnagram(String str1, String str2){
	        int n1=str1.length();
	        int n2=str2.length();

	        int[] fre1=new int[26]; // will store the frequencies of every element of str1
	        for(int i=0; i<n1; i++){
	            char ch=str1.charAt(i);

	            int idx=ch-'a';
	            fre1[idx]++;
	        }

	        int[] fre2=new int[26]; // will store the frequencies of every element of str2
	        for(int i=0; i<n2; i++){
	            char ch=str2.charAt(i);

	            int idx=ch-'a';
	            fre2[idx]++;
	        }

	        for(int i=0; i<26; i++){
	            if(fre1[i]!=fre2[i]){ // frequency of ith character is not equal
	                return false;
	            }
	        }

	        return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);

	        String str1=scn.nextLine();
	        String str2=scn.nextLine();
	        boolean res = checkAnagram(str1, str2);
	        if(res == true) {
	        	System.out.print("True");
	        }
	        else {
	        	System.out.print("False");
	        }

	}

}
