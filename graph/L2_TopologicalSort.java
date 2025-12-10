package apx.graph;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L2_TopologicalSort {
    public void top(List<List<Integer>> graph, int n , int m ){

        int indegree [] = new int [n];

        for(int u = 0 ; u< n ; u++){
            List<Integer> nbr = graph.get(u);
            for( int v : nbr){
                indegree [v]++;
            }

        }

        Queue<Integer> q = new LinkedList<>() ;
        for(int i = 0 ; i< n ;i++){
            if(indegree[i] == 0){
                q.add(i) ;
            }
        }
        

        while(q.size() >0){
            int r  = q.remove() ;
            System.out.println(r) ;

            List<Integer> nbrs = graph.get(r) ;
            for( int v : nbrs){
                indegree[v]-- ;
                if(indegree[v] == 0){
                    q.add(v) ;
                }
            }
        }
    }
}
