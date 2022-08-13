package Queue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
public class TimeRequiredToBuy {
	
	public static int timeRequiredToBuy(int tickets[], int k) {
        Queue<Integer> que=new ArrayDeque<>();
        
        int n=tickets.length;
        
        for(int i=0; i<n; i++){
            if(i==k){
                que.add(-1 * tickets[i]);
            } else {
                que.add(tickets[i]);
            }
        }
        
        int time=0;
        while(que.size()>0){
            int front_ele=que.remove();
            
            if(front_ele==-1) return time+1;
            
            if(front_ele<0){
                front_ele++;
            } else {
                front_ele--;
            }
            
            if(front_ele!=0){
                que.add(front_ele);
            }
            
            time++;
        }
        return time;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 int n = scn.nextInt();
		 
		 int[] st = new int[n];
		 
		 int tar = scn.nextInt();
		 
		   for(int i=0; i<n; i++){
	           st[i] = scn.nextInt(); 
	        }
		  
		   int res = timeRequiredToBuy(st, tar);
		   System.out.println(res);
	}

}
