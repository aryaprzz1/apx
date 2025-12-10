package apx.Trees;

public class L1_TreeTraversal {
    void preOrder(TNode root){// NLR
        if(root ==  null)return ;

        System.out.println(root.val);
        preOrder(root.left) ;
        preOrder(root.right) ;
    }
    void inOrder(TNode root){ // LNR
        if(root == null)return ;

        inOrder(root.left);
        System.out.println(root.val) ;
        inOrder(root.right);
    }

    void postOrder(TNode root){ // L R N
        if(root == null )return;

        postOrder(root.left);
        postOrder(root.right) ;
        System.out.println(root.val );
    }
}
