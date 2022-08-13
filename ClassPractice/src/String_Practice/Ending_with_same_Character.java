package String_Practice;

import java.util.Scanner;

public class Ending_with_same_Character {
	public static int countWithEndCharactersSame(String str){
        int ans=0;
        int n=str.length();

        for(int sp=0; sp<n; sp++){
            for(int ep=sp; ep<n; ep++){
                char ch_sp=str.charAt(sp);
                char ch_ep=str.charAt(ep);

                if(ch_sp==ch_ep){
                    ans++;
                }
            }
        }

        return ans;
    }

   public static void main(String[] args) {
        // TODO Auto-generated method stub
         Scanner scn=new Scanner(System.in);

            String str=scn.nextLine();
        int res =  countWithEndCharactersSame(str);
            
         System.out.println(res);

    }
}
