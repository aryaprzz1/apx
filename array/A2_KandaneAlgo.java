package apx.array;

public class A2_KandaneAlgo {
    public int maxSubArray(int[] nums) {
        int sum = 0 ; 
        int ans = Integer.MIN_VALUE;

        for(int i = 0 ; i <nums.length ; i++){
            if(sum>= 0){
                sum = sum + nums[i];
            }else{
                sum = nums[i];
            }
            Math.max(ans,sum);
        }
        return ans;
    }
}
