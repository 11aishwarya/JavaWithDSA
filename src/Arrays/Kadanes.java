package Arrays;

public class Kadanes {
    //To find maxSubArray sum with linear time complexity 0(n)
    public static void kadanes(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i< nums.length;i++){
            currSum = currSum + nums[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("Our Maximum Subarray sum is :" + maxSum);
    }
    public static void main(String[] args) {
        int nums[] = {3,4,5,-1,-3,7,2};
        kadanes(nums);
    }
}
