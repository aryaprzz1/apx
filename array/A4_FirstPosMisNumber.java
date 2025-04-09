package apx.array;

public class A4_FirstPosMisNumber {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length ;
        int i = 0 ;
        while(i< n){
            if(nums[i]> n || nums[i]< 1 || i == nums[i] - 1){
                i++;
            }else{
                int index = nums[i]-1;
                if(nums[i] == nums[index]){
                    i++;
                }else{
                int temp = nums[i] ;
                nums[i] = nums[index] ;
                nums[index] = temp ;}
            }
        }

       for(int j = 0 ; j< n ; j++){
            if(j != nums[j]-1){
                return j+1 ;
            }
        }
        return n+1 ;
        
    }
    
}
