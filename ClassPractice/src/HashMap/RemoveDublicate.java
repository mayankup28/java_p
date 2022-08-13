package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveDublicate {
	public static String removeAllDublicate(String str) {
		String ans="";
	
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
//			System.out.println(ch);
			if(map.containsKey(ch)) {
				int fre=map.get(ch);
				map.put(ch, fre+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		 for(int i=0; i<str.length(); i++){
	           char ch = str.charAt(i);
	        
	            int fre=map.get(ch);
	            if(fre==1) {
	            	ans = ans+ch;
	            	
	            }
	           
	            

	        }
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
	        
	        String str=scn.nextLine();
	        


	        
	        String ans=removeAllDublicate(str);
	        int res = ans.length();
	       if(res>=1) {
	    	   System.out.println(ans);
	       }
	       else {
	    	   System.out.println("VANISHED");
	       }
	}

}
