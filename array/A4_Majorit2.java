package apx.array;

import java.util.ArrayList;
import java.util.List;

public class A4_Majorit2 {
    public List<Integer> maj2(int nums[]){
        List<Integer> ans = new ArrayList<>();

        int n =  nums.length ;

        int value1 = 0 ;
        int value2 = 0 ;
        int count1  = 0;
        int count2 = 0 ;

        for(int i = 0 ; i< n ;i++){
            if(value1 ==  nums[i]){
                count1++ ;
            }else if(value2 == nums[i]){
                count2++ ;
            }
            else if(count1 == 0){
                value1 = nums[i];
                count1++ ;
            }else if(count2 == 0){
                value2 = nums[i];
                count2++;
            }else{
                count1-- ;
                count2-- ;
            }
        }
        int c1 = 0 ;
        int c2 = 0 ;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value1)  c1++ ;
          
            if (nums[i] == value2) c2++;
          
        }
        if(c2 > n/3){
            ans.add(value2);
        }
        if (c1 > n/3) {
            ans.add(value1);
        }


        return ans ;

    }
}
