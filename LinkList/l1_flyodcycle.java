package apx.LinkList;

import java.util.Scanner;

class Node{
 int val ;
 Node next ;
 Node(int val){
  this.val =val ;
  this.next = null ;

 }
}
public class l1_flyodcycle {
  
    static Node flyodcycle(Node head){
        Node s = head ;
        Node f = head ;
        boolean exists = false ;

        while(f.next!=null && f.next.next!=null){
          s = s.next;
          f = f.next.next ;

          if(s == f){
            exists = true ;
            break;
          }
        }

        if(exists){
          s= head;
          while(s != f){
            s=s.next;
            f=f.next ;
          }
        }else{
          return null ;
        }
        return s ;
    }

    static Node build(int n , Scanner sc ){
      Node head = new Node(sc.nextInt());
      
      Node t = head ;

      for(int i = 1 ; i<n ;i++){
        t.next = new Node(sc.nextInt());
        t= t.next ;
      }
      return head;
    }

    static Node connect(Node h , Scanner sc){
        int pos = sc.nextInt();
        if(pos == -1){
          return h;
        }

       Node t = h ;
      while(t.next != null){
        t =t.next;
      }

      Node s = h ;
      for(int i = 0 ; i< pos; i++){
        s = s.next;
      }
      t.next = s ;
      return h ;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node head =build(n, sc);
        head = connect(head,sc);
        Node ans = flyodcycle(head);
        if(ans == null){System.out.println("null");}
        else{
        System.out.println(ans.val);}

    }

}
// Given the head of a singly linked list, return the node where a cycle begins. If there is no cycle, return null.

// A cycle exists in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. The position where the cycle starts is denoted by the index of the node (0-indexed) to which the tail's next pointer is connected. If there is no cycle, the function should return null.

// You must not modify the linked list.

// Input Format:
// The first line contains an integer n, the number of nodes in the linked list.
// The second line contains n space-separated integers representing the node values of the linked list.
// The third line contains an integer pos, representing the index where the tail connects to form a cycle (-1 if there is no cycle).

// Output Format:
// Output the value of the node where the cycle begins. If no cycle exists, output null.

// Constraints:
// The number of the nodes in the list is in the range [0, 104].
// -105 <= Node.val <= 105
// pos is -1 or a valid index in the linked-list