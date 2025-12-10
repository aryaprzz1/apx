package apx.graph;

import java.util.ArrayList;
import java.util.List;

public class L1_adjanceylist {
    public  List<List<Integer>> adjanceyList(int n, int m,int g[][]){

        List<List<Integer>> graph = new ArrayList<>();
       // int n = graph.size() ;
        for( int i = 0 ; i < n; i++){
            graph.add(new ArrayList<>()) ;
        }   

        for( int i = 0 ; i< m ; i++){
            int u = g[i][0];
            int v = g[i][1] ;
           // int wt = g[i][2] ;

            graph.get(u).add(v);
            graph.get(v).add(u);

        }

        return graph;

    }

    public  List<List<graphPair>> adjanceyListweight(int n, int m,int g[][]){

        List<List<graphPair>> graph = new ArrayList<>();
       // int n = graph.size() ;
        for( int i = 0 ; i < n; i++){
            graph.add(new ArrayList<>()) ;
        }   

        for( int i = 0 ; i< m ; i++){
            int u = g[i][0];
            int v = g[i][1] ;
            int wt = g[i][2] ;

            graph.get(u).add(new graphPair(v, u, wt));
            graph.get(v).add(new graphPair(v,u,wt));

        }

        return graph;

    }
}
