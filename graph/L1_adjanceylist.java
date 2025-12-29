package apx.graph;

import java.util.ArrayList;
import java.util.List;

public class L1_adjanceylist {
    
    public List<List<Integer>> ConstAdjList(int nodes, int edges , int edge[][]){
        int n  = nodes ;
        int m = edges ;

        List<List<Integer>> graphlist = new ArrayList<>() ;

        for( int i = 0  ; i< n ; i++){
            graphlist.add(new ArrayList<>()) ;
        }

        for( int i = 0 ; i<edge.length ;i++){
            int u = edge[i][0] ;
            int v = edge[i][1] ;

            graphlist.get(u).add(v);
            graphlist.get(v).add(u) ;
        }

        return graphlist ;

    }

    public List<List<graph>> ConstAdjListWeight(int node, int edge , int edges[][]){
        int n = node ;
        int m = edges.length ;

        List<List<graph>> graphlist = new ArrayList<>() ;

        for(int i = 0 ; i< n; i++){
            graphlist.add(new ArrayList<>());
        }

        for( int  i = 0 ; i < m ;i++){
            int u = edges[i][0] ;
            int v =  edges[i][1] ;
            int wt = edges[i][2] ;
            
            graphlist.get(u).add(new graph(v,wt));
            graphlist.get(v).add(new graph(u,wt));
        }

        return graphlist ;
    }














    
}
