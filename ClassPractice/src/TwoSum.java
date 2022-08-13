import java.util.*;

public class TwoSum{
    // two sum brute ================================================================ 
    
	public static int countPairs(int[] nums, int target){
        Arrays.sort(nums);

        int n=nums.length;

        int i=0;
        int j=n-1;
        int count=0;

        while(i<j){
            int sum=nums[i] + nums[j];

            if(sum==target){
                count++;
                i++;
                j--;
            } else if(sum < target){
                i++;
            } else {
                j--;
            }
        }
        

        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0; i<n;i++) {
		arr[i] = sc.nextInt();
	}
	int res = countPairs(arr, n);
	System.out.println(res);
    
	}
    
}