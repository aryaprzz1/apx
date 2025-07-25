package apx.LinkList;

import java.util.Scanner;

class Node{
    int val ;
    Node next ;
    Node(int val){
        this.val = val ;
        this.next = null ;
    }
}
public class L1_reverse {

    static Node reverse(Node head){
        Node cur = head ;
        Node prev = null;
        while(cur!=null){
           Node cn = cur.next ;
           cur.next = prev ;
           prev = cur ;
           cur = cn ;
        }

        return prev ;

    }
    static Node build(int n , Scanner sc){
        Node head = new Node(sc.nextInt());
        Node t = head;
        for(int i = 1 ; i< n ;i++){
        t.next =new Node(sc.nextInt());
        t= t.next;
        }
        return head ;
    }

    static void print(Node rh){
        Node t  = rh ;
        while(t!=null){
            System.out.print(t.val + " ");
            t= t.next ;
        }
        System.out.println();
    }

    public static void main(String []a){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        if(n == 0){
            System.out.println();
            sc.close();
            return ;
        }

        Node head = build(n, sc);

        head = reverse(head);
        print(head);

    }
    
}
