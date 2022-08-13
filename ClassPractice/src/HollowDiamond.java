import java.util.Scanner;

public class HollowDiamond {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nstars = (int)Math.ceil(n/2)+1;
        int spaces = 1;
        for(int i=0; i<=n/2; i++)
        {
            for(int j=0; j<nstars; j++){
                System.out.print("*");
            }
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            for(int j=0; j<nstars; j++){
                System.out.print("*");
            }
            nstars--;
            spaces+=2;
            
            System.out.println();
        }
       
        nstars+=2;
        spaces -=4;
        
       // System.out.print(spaces); 
        for(int i=0; i<n/2; i++){
             for(int j=0; j<nstars; j++){
                System.out.print("*");
            }
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            for(int j=0; j<nstars; j++){
                System.out.print("*");
            }
            spaces-=2;
            nstars++;
            System.out.println();
        }
    }

}
