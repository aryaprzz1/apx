package apx.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L1_LevelOrder1 {
    void levelOrder(TNode root){
        Queue<TNode> q = new LinkedList<>() ;
        q.add(root) ;

        while(!q.isEmpty()){
            TNode node = q.remove() ;
            System.out.println(node.val);

            if( node.left !=  null){
                q.add(node.left) ;
            }
            if( node.right !=  null){
                q.add(node.right) ;
            }
        }

    }

        void levelOrder2(TNode root){
        Queue<TNode> q = new LinkedList<>() ;
        q.add(root) ;

        while(!q.isEmpty()){
          int n = q.size() ;

          for(int i= 1 ; i<= n ; i++){
            TNode node = q.remove() ;
            System.out.println(node.val + " ");

            if( node.left !=  null){
                q.add(node.left) ;
            }
            if( node.right !=  null){
                q.add(node.right) ;
            } 
          }
           System.out.println();
        }
    }
        public List<List<Integer>> levelOrder3(TNode root){
            List<List<Integer>> ans = new ArrayList() ;

            Queue<TNode> q = new LinkedList<>();
            while(q.size() > 0){
                int n = q.size() ;
                List<Integer> t = new ArrayList<>() ;
                for(int i = 1 ; i <= n ;i++){
                    TNode r = q.remove() ;
                    t.add(r.val);

                    if(r.left !=  null){
                        q.add(r.left) ;
                    }
                    if(r.right != null){
                        q.add(r.right) ;
                    }
                }
                ans.add(t)    ; 

            }

            return ans ;
        }
}
