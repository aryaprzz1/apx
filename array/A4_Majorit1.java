package apx.array;

public class A4_Majorit1 {
    public int majority(int nums[]){
        int n =  nums.length ;

        int count  =  0 ;
        int maj = 0 ;
        for(int i = 0 ; i<n ; i++){
            if(count == 0 ){
                maj =nums[i];
                count++;
            }else{
                if(nums[i] == maj){
                    count++;
                }else{
                    count-- ;
                }
            }
        }
        return  maj ;
    }
}
