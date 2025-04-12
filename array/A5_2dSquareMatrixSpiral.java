package apx.array;

import java.util.ArrayList;
import java.util.List;

public class A5_2dSquareMatrixSpiral {
    public List<Integer> spiralOrder(int[][] matrix){
        int n =  matrix.length -1 ;
        int m = matrix[0].length -1 ;

        List<Integer> ans = new ArrayList<>();
 
        int  i = 0 ;
        int j = 0;

        while (n>=1 && m>=1) {
            for(int k = 0 ; k< m  ; k++){
                ans.add(matrix[i][j]);
                j++ ;
            }
            for(int k = 0 ; k< n  ; k++){
                ans.add(matrix[i][j]);
                i++ ;
            }
            for(int k = 0 ; k<m ; k++){
                ans.add(matrix[i][j]);
                j-- ;
            }
            for(int k = 0 ; k< n ; k++){
                ans.add(matrix[i][j]);
                i-- ;
            }
            i++;
            j++;
            n -= 2;
            m -= 2;
        }

        if(n == 0 ){
            for (int j2 = 0; j2 < m+1; j2++) {
                ans.add(matrix[i][j]);
                j++;
            }
        }
        else if (m==0) {
            for (int j2 = 0; j2 < n+1; j2++) {
                ans.add(matrix[i][j]);
                i++;
            }
            
            
        }

        return ans;
        


    }
    
}
