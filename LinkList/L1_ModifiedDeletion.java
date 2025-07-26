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
public class L1_ModifiedDeletion {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int linkSize [] = new int [n] ;
        for(int i = 0 ; i< n ; i++){
            linkSize[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        Node h = BuildList(linkSize);
        todelete(h, x) ;
        printList(h);
        sc.close();
       
    }  
    
    static Node todelete(Node head,int v){
       Node del = head ;
        while(del!= null && del.val != v){
            del = del.next ;
        }
        del.val =del.next.val ;
        del.next = del.next.next ;

        return head ;
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
         System.out.println();
    }
}
