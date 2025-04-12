package apx.array;

public class A3_2dTransposeMatrix {
    public int[][] transpose(int[][] matrix) {

        int m = matrix.length ;
        int n = matrix[0].length;

        

        if(m == n){
        for(int i = 1 ; i< m ;i++){
            for(int j = 0 ; j < i ;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp ;
            }
        }
        }else{
            int tran[][] = new int[n][m];
            for(int i = 0 ; i< m ; i++){
                for(int j = 0 ; j<n ; j++){
                    tran[j][i] = matrix[i][j];
                }
            }
            return tran ;
        }

        return matrix;
    }
    
}
