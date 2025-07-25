package apx.LinkList;

import java.util.Scanner;

class Node {
    int val ;
    Node next;

    Node(int v){
        this.val = v;
        this.next = null ;
    }

}
public class L1_middle {
   

    static Node build(int n , Scanner sc){
        Node h = new Node(sc.nextInt()) ;
        Node t = h ;
        for(int i =1 ; i< n ;i++){
            t.next = new Node(sc.nextInt());
            t= t.next ;
        }
        return h ;

    }

    // static void print(Node p ){
    //     Node t = p ; 

    //     while( t!=null){
    //         System.out.print(t.val + " ");
    //         t= t.next;
    //     }
    //     System.out.println();
    // }

    static Node middle(Node head){
        Node s = head ;
        Node f = head;

        // while(f.next != null && f.next.next != null){
        //     s = s.next ;
        //     f = f.next.next ;
        // }      first middle

        while(f !=null && f.next!=null){
            s= s.next ;
            f = f.next.next ;
        }
        return s ;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt() ;   
        Node head  = build(n,sc);
         head =middle(head) ;
            // print(head);
        System.out.println(head.val);
    }
}
// Problem Statement
// Given the head of a singly linked list, find and return the middle node of the linked list. If the list has an even number of nodes, return the second of the two middle nodes.

// Input Format:
// The first line contains an integer n, the number of nodes in the linked list.
// The next n lines each contain an integer, representing the values of the nodes in the linked list.

// Output Format:
// Print the value of the middle node in the linked list.

// Constraints:
// The number of nodes in the list is in the range [1, 100].
// 1 <= Node.data <= 100 