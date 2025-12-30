package apx.graph;

import java.util.Arrays;

public class BellmanFord {
    public int [] bellmanFord(int edges [][] ,int src,int ver){
        int dist [] = new int[ver] ;
        Arrays.fill(dist,Integer.MAX_VALUE );

        dist[src] = 0 ;
        
        for( int i = 0 ; i < ver-1 ;i++){
            for(int j = 0 ; j < edges.length ;j++ ){
                int u = edges[j][0] ;
                int v = edges[j][1] ;
                int w = edges[j][2] ;

                if(dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w ;
                }
            }
        }
        Boolean flag = false ;
        for( int j = 0 ; j< edges.length; j++){
            int u = edges[j][0] ;
            int v = edges[j][1] ;
            int w = edges[j][2] ;

            if(dist[u] != Integer.MAX_VALUE && dist[u] +w < dist[v]){
               // dist[v] = dist[u] + w ;
                flag =true;
                break;
            }
        }


        return dist ;
    }
}
