import java.util.Arrays;
import java.util.Scanner;

public class Sort_Matrix {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int[] b = new int[m*n];
        int k = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                b[k++] = a[i][j];
            }
        }
        Arrays.sort(b);
        
        k = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = b[k++];
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
               System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
