package apx.Trees;

public class L1_SizeOfTree {
    int c = 0 ;
    void sizeTree(TNode root){
        if(root ==  null) return ;

        c++ ;
        sizeTree(root.left);
        sizeTree(root.right) ;

    }

    int sizeTree2(TNode root){

        if( root == null) return 0 ;
        
        int x =  sizeTree2(root.left) ;
        int y =  sizeTree2(root.right) ;

        return x + y +1 ;
    }
}
