import java.util.Scanner;
import java.util.Stack;
public class Balance_brackets {
	public static boolean isValid(String str) {
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch=='{' || ch=='(' || ch=='[') {
				st.push(ch);
			}
			else if(ch==')') {
				if(st.size()==0 || st.peek()!='(') {
					return false;
				}
				
				st.pop();
			}
			
			else if(ch=='}') {
				if(st.size()==0 || st.peek()!='{') {
					return false;
				}
				st.pop();
			}
			else if(ch==']') {
				if(st.size()==0 || st.peek()!='[') {
					return false;
				}
				st.pop();
			}
			
		}
		if(st.size()==0) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		boolean res = isValid(str);
		if(res == true) {
			System.out.print("True");
		}
		else {
			System.out.print("False");
		}
	}

}
