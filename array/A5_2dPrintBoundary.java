package apx.array;

public class A5_2dPrintBoundary {
    public void printboundary(int arr[][]){
        int i = 0 ;
        int j = 0;
        int n = arr.length;
        for(int k = 0 ; k<n -1 ;k++){
            System.out.println(arr[i][j]);
            j+=1 ;
        }
        for(int k = 0 ; k<n -1 ;k++){
            System.out.println(arr[i][j]);
            i+=1 ;
        }
        for(int k = 0 ; k<n -1 ;k++){
            System.out.println(arr[i][j]);
            j-=1 ;
        }
        for(int k = 0 ; k<n -1 ;k++){
            System.out.println(arr[i][j]);
            i-=1 ;
        }
    }
}
