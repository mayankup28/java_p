package Queue;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class CircularSquare_Snadwhich {
	
	public static int countStudents(int students[], int sandwhiches[]) {
		Stack<Integer> st = new Stack<>();
		int n = students.length;
		for(int i=n-1;i>=0;i--) {
			st.push(sandwhiches[i]);
		}
		Queue<Integer> que = new ArrayDeque<Integer>();
		
		for(int i=0;i<n;i++) {
			que.add(students[i]);
		}
		
		while(st.size()>0) {
			int curr_students = st.size();
			while(curr_students>0 && que.peek()!=st.peek()) {
				int front_ele = que.remove();
				que.add(front_ele);
				
				curr_students--;
			}
			
			if(curr_students==0) return st.size();
			st.pop();
			que.remove();
		}
		return 0;
	}
	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		 int n = scn.nextInt();
		 int[] st = new int[n];
		   for(int i=0; i<n; i++){
	           st[i] = scn.nextInt(); 
	        }
		   int[] std = new int[n];
		   for(int i=0; i<n; i++){
	           std[i] = scn.nextInt(); 
	        }
		   int res = countStudents(st, std);
		   System.out.println(res);
	}

}
