package apx.array;

import java.util.Arrays;

public class A4_NextGreater3 {
    public int nextGreaterElement(int n){
        char num [] = (n + "").toCharArray();

        int index = -1 ;
        for(int i = num.length-2 ; i>=0 ; i--){
            if(num[i]< num[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1) return index ;

        char val = num[index];
        int smallindex = index + 1 ; 

        for(int i = index + 1 ; i< num.length ; i++){
            if(num[i] > val  && num[i] <= num[smallindex]){
                smallindex = i ;
            }
        }

        char t = num[index];
        num[index] = num[smallindex];
        num[smallindex] = t ;

        // Arrays.sort(num,index +1,num.length);
        int s = index+1; 
        int e = num.length-1;
        while(s<e){
            char k = num[s];
            num[s] = num[e];
            num[e] = k;
            s++ ; 
            e-- ;
        }


        long ans  = Long.parseLong(new String(num));
        if (ans> Integer.MAX_VALUE) {
            return -1 ;
        }else{
            return (int)ans;
        }
    }
}
