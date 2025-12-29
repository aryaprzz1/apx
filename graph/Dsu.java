package apx.graph;

public class Dsu {
    int par [] ;
    int rank [] ;

    public int connectedComp(int edges[][], int nodes){
        int n  = nodes;
        par = new int[n] ;
        rank = new int[n];

        for(int i = 0 ; i< n ;i++){
            par[i] = i ;
            rank[i] =1 ;          
        }

        for( int i = 0 ; i< edges.length; i++){
            int x = edges[i][0];
            int y = edges[i][1];
            union(x,y) ;
        }
        int ans = 0 ;
        for( int i = 0 ; i< n ;i++){
            if(par[i] == i)ans++ ;
        }

        return ans;
    }

    public void union(int x, int y){
        int px = find(x);
        int py = find(y) ;

        // same parent == same component
        //not same p -> make largerchain the parent for less iterations and not rank increase;
        if(px == py)return ;

        if(rank[px] > rank[py]){
            par[py] = px ;
        }else if(rank[py] > rank[px]){
            par[px] = py ;
        }else if(rank[px] == rank[py] ){
            par[px] =py ;

            rank[py]++ ;
        }

    }

    public int find(int x){
        if( x == par[x]) return x;

        int t = find(par[x]) ;
        par[x] = t ;//path compression
        
        return t ;
    }
}
