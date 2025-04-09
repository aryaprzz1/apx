package apx.array;

public class A2_SubArrayBoundedMax {
    public int msaxBound(int nums[], int left , int right){
        int n = nums.length ;

        int ans = 0 ;
        int validStart = 0 ;
        int lgei = 0;

        for(int i = 0 ; i< n ; i++){
            if(nums[i] > right ){
                ans = ans + 0 ;
                lgei = i+1 ;
                validStart = 0 ;
            }else if(nums[i]>= left && nums[i] <= right){
                ans = ans + i - lgei +1 ;
                validStart = i - lgei + 1 ;
            }else if (nums[i]<left) {
                ans += validStart ;
                
            }
        }
        return ans ;
    }
    
}
