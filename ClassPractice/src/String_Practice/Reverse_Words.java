package String_Practice;

import java.util.Scanner;

public class Reverse_Words {
	public static void check_reverseWord(String str) {
		String ans = "";
		String[] arr = str.split(" ");
		int num = arr.length;
		for(int i=num-1; i>=0;i--) {
			ans = ans +arr[i]+" ";
			
		}
		System.out.print(ans);
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);

        String str1=scn.nextLine();
        check_reverseWord(str1);
	}

}
