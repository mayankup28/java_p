package String_Practice;

import java.util.Scanner;


public class MinDistance_TwoVowel {
	static boolean isVowel(char ch){
		if(ch=='A' || ch=='a'|| ch=='E' || ch=='e'|| ch=='I' || ch=='i' || ch=='O'|| ch=='o' || ch=='U' || ch=='u') {
			return true;
		}
           return false;    
	}
	
	public static void min_max_distance_twoVowel(String str) {
		int first_occurrence = -1;
		int last_occurrence = -1;
		int n = str.length();
		
		int last = -1;
		int min_dis = Integer.MAX_VALUE;
		
		for(int i =0;i<n;i++) {
			char ch = str.charAt(i);
			if(isVowel(ch)==true) {
				if(first_occurrence == -1) {
					first_occurrence = i;
				}
				last_occurrence = i;
				//find minimum distance------
				if(last == -1) {
					last = i;
				}
				else {
					int distance = i - last;
					min_dis = Math.min(min_dis, distance); 
				}
			}
		}
		
		int max_distance = last_occurrence -  first_occurrence;
		System.out.println("Max Distance = " + max_distance);
		System.out.println("Min Distance = " + min_dis);
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
        String str=sn.next();
        min_max_distance_twoVowel(str);
	}

}
