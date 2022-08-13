package String_Practice;

import java.util.Scanner;

class CountVowel{
	static boolean isVowel(char ch){
		return (ch=='A' || ch=='a'|| ch=='E' || ch=='e'|| ch=='I' || ch=='i' || ch=='O'|| ch=='o' || ch=='U' || ch=='u');
               
	}
	
	static int countVowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i))) 
                ++count;
        		return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);

	        String str=scn.nextLine();
	        
	      int res =  countVowels(str);
	      System.out.println(res);
	}

}
