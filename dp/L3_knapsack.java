package apx.dp;

public class L3_knapsack {
    
    

    public int [][] iterativekp(int weigth [] , int value[], int capacity ){
        int n = weigth.length  ;
        int dp [][] = new int[n][capacity+1];
        

        int w0 = weigth[0] ;
        for(int w = w0 ; w <= capacity ; w++){
            dp[0][w] = value[0] ;
        }

        for(int i = 1  ; i < n ; i++){
            for(int k = 0 ; k<= capacity ;k++){
                if(weigth[i] <= k){
                    dp[i][k] = Math.max(dp[i-1][k-weigth[i]] +value[i], dp[i-1][k]) ; 
                }else{
                    dp[i][k] = dp[i-1][k] ;
                }
            }
        }

        return dp ;

    }

    int dp [][] ;

    public int knapsack01(int weight [], int value[] , int k , int i ){
        int n = weight.length;
        

        if(dp == null){
            dp = new int[n] [k+1];
            for(int a = 0 ; a< n ;a++){
                for(int j = 0 ; j <= k ;j++ ){
                    dp[a][j] = -1 ;
                }
            }
        }
        
        if(i == -1 || k <= 0){return 0 ;}// index out of bounds , nedative i , k == 0 // k<= 0 --> nedative k (no items, no capacity)

        if(dp[i][k] != -1){return dp[i][k] ;}

        int l1 = knapsack01(weight , value, k , i-1);

        int t1 = 0 ;
        if(k >= weight[i]){
            t1 = knapsack01(weight, value ,k-weight[i] ,i-1) + value[i];
        }

        dp[i][k] = Math.max(l1,t1) ;

        return dp[i][k] ;

    }
    public static void main(String[] args) {
        
    }
}
