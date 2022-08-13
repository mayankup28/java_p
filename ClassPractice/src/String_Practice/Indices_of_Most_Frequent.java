package String_Practice;

import java.util.*;
public class Indices_of_Most_Frequent {
	
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String str=sn.next();
        
        int arr[]=new int[26];
        for(char ch:str.toCharArray())
            arr[ch-'a']++;
        
        int max_freq=0;
        for(int i=0;i<26;i++){
           if(arr[i]>max_freq)
               max_freq=arr[i];
        }
        int most_oc=-1;
        for(int i=0;i<26;i++){
            if(arr[i]==max_freq)
            {
               most_oc=i;
                break;
            }
        }
        char cmp=(char)(most_oc+97);
       
        for(int i=0;i<str.length();i++){
            
            if(str.charAt(i)==cmp)
            {
                System.out.print((i+1)+" ");
            }
        }
        
    }

}

//public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int[] cnt = new int[26];
//        Arrays.fill(cnt, 0);
//        for(int i=0; i<s.length(); i++){
//            cnt[s.charAt(i)-'a']++;
//            System.out.print(cnt[i]);
//        }
//        int maxFreq = cnt[0];
//        char maxChar = 'a';
//        
//        for(int i=1; i<26; i++){
//            if(cnt[i] > maxFreq){
//                maxFreq = cnt[i];
//                maxChar = (char)(i+'a');
//            }
//        }
//        for(int i=0; i<s.length(); i++){
//            if(maxChar == s.charAt(i)){
//                System.out.print(i+1+" ");
//            }
//        }
//    }