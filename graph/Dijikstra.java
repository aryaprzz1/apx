package apx.graph;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijikstra {

    public int [] dijk(List<List<graphpair>> graph , int src,int nodes){
        int n = nodes ;
        int vis [] = new int[n] ;
        Arrays.fill(vis,Integer.MAX_VALUE);
        
        PriorityQueue<graphpair> pq = new PriorityQueue<>() ;
        
        pq.add(new graphpair(src,0));

        while(!pq.isEmpty()){
            graphpair node = pq.remove() ;

            if(vis[node.v] != Integer.MAX_VALUE){
                continue ;
            }

            vis[node.v] = node.w ;

            List<graphpair> nbrs = graph.get(node.v);

            for( graphpair nb : nbrs ){
                if(vis[nb.v] != Integer.MAX_VALUE){continue;}

                pq.add(new graphpair(nb.v,nb.w + node.w));
            }

        }

        return vis ;
    }
    public int[] d (List<int[]> [] g , int src , int nodes){

        PriorityQueue<int []> pq = new PriorityQueue<>( (a,b) -> a[1] -b[1]) ;///min heap with weight
        int dist[] = new int[nodes] ;
        Arrays.fill(dist,Integer.MAX_VALUE);

        dist[src] = 0 ;
        
        pq.add(new int [] {src,0});

        while(!pq.isEmpty()){
            int [] curr = pq.poll() ;
            int u = curr[0] ;
            int d = curr[1] ;

            if(d > dist[u])continue ;

           for( int edge [] :g[u]){
                int v  = edge[0] ;
                int w =  edge[1] ;

                if(dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w ;
                    pq.add(new int[]{v,dist[v]});
                } 
           }
        }
        return dist ;

    }
}

 class graphpair implements Comparable<graphpair>{
    int v ;
    int w ;
    graphpair(int v , int w){
        this.v = v ;
        this.w = w ; 
    }
    @Override
    public int compareTo(graphpair o){
        return this.w - o.w ;
    }
}

