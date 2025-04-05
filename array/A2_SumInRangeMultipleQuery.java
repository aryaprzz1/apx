package apx.array;

public class A2_SumInRangeMultipleQuery {
    private int pfs[];
    public A2_SumInRangeMultipleQuery(int[] nums) {
        pfs = new int[nums.length];
        pfs[0] = nums[0];
        for(int i = 1 ; i < nums.length;i++){
            pfs[i] = pfs[i-1] + nums[i];
        }
       
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return pfs[right];
        }else{
            return pfs[right] - pfs[left-1] ;
        }
        
    }
    
    public void sumQueryBrute(int arr[],int q[][]){
       for(int i = 0 ; i< q.length ;i++){
        int l = q[i][0];
        int r = q[i][1];

        int s = 0;

        for(int j= l ; j<=r; j++){
            s += arr[j];
        }
        System.out.println(s);
       }

    }

    public void sumQureyOptimal(int arr[],int q[][]){
        
        pfs = new int[arr.length]; 
        pfs[0] =arr[0];
        for (int i = 1; i < arr.length; i++) {
            pfs[i] =pfs[i-1] + arr[i];
        }

        for(int i = 0 ; i<q.length ; i++){
            int l = q[i][0];
            int r = q[i][1];

            if(l>0){
               System.out.println( pfs[r] - pfs[l-1]);
            }else{
                System.out.println(pfs[r]);
            }
        }
    }
}
