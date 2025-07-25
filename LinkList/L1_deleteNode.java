package apx.LinkList;

import java.util.Scanner;

class Node{
    int val ;
    Node next ;

    Node(int val){
        this.val = val ;
        this.next = null;
    }
}

public class L1_deleteNode {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int linkSize [] = new int [n] ;
        for(int i = 0 ; i< n ; i++){
            linkSize[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        Node head = BuildList(linkSize);
        head = deleteXthNode(x,head);
        printList(head);
    }    

    static Node deleteXthNode(int x, Node h){
        Node t = h ;

        if(x == 1){
            return h = t.next ;
        }

        for(int i = 1 ; i< x-1 ; i++){
            if(t!=null && t.next != null){
                t= t.next;
            }
        }
        t.next = t.next.next ;
       
        return h ;

    }

    public static Node BuildList(int arr[]){
        Node head = new Node(arr[0]);

        Node cur = head ;
        for(int i = 1 ; i< arr.length ; i++){
           cur.next = new Node(arr[i]);
           cur = cur.next ;
        }
        return head ;
    }
    public static void printList(Node h){
         Node t = h ;

         while(t != null){
            System.out.print(t.val );
             if(t.next!=null){System.out.print(" ");}
            t=  t.next ;
         }
    }
}
