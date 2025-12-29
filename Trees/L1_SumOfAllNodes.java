package apx.Trees;

public class L1_SumOfAllNodes {
    public int sum(TNode root){
        if( root == null)return 0 ;
        int x  = sum(root.left);
        int y = sum(root.right) ;

        return x + y + root.val ;
    }
}
