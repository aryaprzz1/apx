package apx.array;

public class A3_2dRangeSumQuery {

    int pfs [][] ;
    public  A3_2dRangeSumQuery(int [][] matrix){
        int r  = matrix.length;
        int c = matrix[0].length ;
        
        pfs = new int[r][c] ;

        for(int i =0 ; i< r ; i++){
            for(int j = 0 ; j<c ; j++){
                if(j == 0 ){
                    pfs[i][j] = matrix[i][j];

                }else{
                    pfs[i][j] = pfs[i][j-1] + matrix[i][j];

                }
            }
        }

        for(int j  = 0 ; j< c ; j++){
            for (int i = 1; i < r; i++) {
                pfs[i][j] = pfs[i-1][j] + pfs[i][j];
            }
        }

    }

    public int sumRegion(int row1,int col1,int row2 , int col2){
            int sum = 0 ;
            sum = sum + pfs[row2][col2];

            if (row1 -1 >= 0 ) { sum = sum -pfs[row1 -1][col2] ;}
            if(col1 -1 >= 0){sum = sum - pfs[row2][col1 -1];}

            if(row1 -1 >=0 && col1 -1 >= 0){sum= sum + pfs[row1-1][col1 - 1] ;}

        return sum ;
    }
    
}
