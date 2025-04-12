package apx.array;

public class A3_2dSumAllSubMatrix {
    public int sum(int arrpfs[][]){
        int r = arrpfs.length;
        int c =  arrpfs[0].length;

       // int pfs[][] = new int[r][c];
        int ans = 0 ;
        for(int i = 0 ; i<r ; i++){
            for (int j = 0; j < c; j++) {
                int occ = (i+1) * (j+1)* (r-i)*(c-i) ;
                ans += arrpfs[i][j] * occ ;
            }
        }
        return ans;
    }
}
