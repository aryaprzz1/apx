package apx.array;

public class A5_2dSpiralMatrix {
    public void printSpiral(int arr[][]){
        int n =  arr.length ;
        int m = arr[0].length ;

        int  i = 0 ;
        int j = 0;

        while (n>=1 && m>=1) {
            for(int k = 0 ; k< n -1 ; k++){
                System.out.print(arr[i][j]);
                j++ ;
            }
            for(int k = 0 ; k< m -1 ; k++){
                System.out.print(arr[i][j]);
                i++ ;
            }
            for(int k = 0 ; k<m-1  ; k++){
                System.out.print(arr[i][j]);
                j-- ;
            }
            for(int k = 0 ; k< n-1 ; k++){
                System.out.print(arr[i][j]);
                i-- ;
            }
            i++;
            j++;
            n -= 2;
            m -= 2;

            if(n == 0 ){
                for (int j2 = 0; j2 < m+1; j2++) {
                    System.out.print(arr[i][j]);
                    j++;
                }
            }
            else if (m==0) {
                for (int j2 = 0; j2 < n+1; j2++) {
                    System.out.print(arr[i][j]);
                }
                i++;
                
            }
        }
        


    }
}
