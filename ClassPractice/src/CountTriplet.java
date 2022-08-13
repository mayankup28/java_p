import java.util.Arrays;

public class CountTriplet {

	public static int countTriplet(int[] nums, int target){
        Arrays.sort(nums);
        int n=nums.length;

        int count=0;

        for(int k=0; k<n-2; k++){
            int i=k+1;
            int j=n-1;

            int required_sum=target-nums[k];

            while(i<j){
                int sum=nums[i] + nums[j];

                if(sum==required_sum){
                    count++;
                    i++;
                    j--;
                } else if(sum<required_sum){
                    i++;
                } else {
                    j--;
                }
                
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{-1,11,-2,5,13,9,4,-4,15};
        int target=9;

        System.out.println("Total number of pairs = "+countTriplet(nums,target));
    }
}

