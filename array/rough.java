public class rough {
    public int minOperations(int[] nums, int x) {
        int n = nums.length ;

        int maxlen = -1 ;
        int tsum = 0 ;
        for( int num  :nums ) tsum += num;

        int t = tsum - x ;

        int cs = 0 ;
        int l = 0 ;
        for(int r  = 0 ; r < n ;r++){
           cs = cs + nums[r] ;

           while(cs > 0){
            cs -= nums[l] ;
            l++ ;
           }

           if(cs == t){
            maxlen = Math.max(maxlen,r-l+1) ;
           }
           
        }
        return maxlen == -1 ? -1 : maxlen;
    }
}
