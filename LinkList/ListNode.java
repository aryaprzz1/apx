package apx.LinkList;

class Node {
    int val ;
    Node next;

    Node(int v){
        this.val = v;
        this.next = null ;
    }

}

public class ListNode{
    private int data;
    private ListNode next;

    public ListNode(int data){
        this.data = data ;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data ;
    }

    public void setNext(ListNode next){
        this.next = next ;
    }
    public ListNode getNext(){
        return this.next;
    }


    public int length(ListNode HeadNode){
        int count = 0;
        ListNode currentNode = HeadNode ;
        while(currentNode != null){
            count++;
            currentNode =currentNode.next;
        }
        return count  ;

    }
        ListNode head;
    public void insertAtStart(ListNode node){
        node.next = head ;
        head = node ;
    }

    public void insertAtEnd(ListNode node){
        if(head == null){
            head = node ;
        }else {
            ListNode curNode = head ;
            while(curNode.next != null){
                curNode = curNode.next ;
            }
            curNode.next = node;
            
        //     ListNode p ,q ;

        // for( p = curNode ; (q = p.next) != null ; p =q );
        // p.next = node ;
    }
}

    public void insertAtIndex(int index, int val , ListNode node){      
            if(index < 0){
                index =0 ;
            }
            //length
            if(head == null){
            head = new ListNode(val);
            }else if(index ==0){
                ListNode t = new ListNode(val);
                t.next = head ;
                head = t ;

            }else{
                ListNode t = head ;

                for(int i = 1 ; i < index ; i++){
                    t =t.next ;
                }

                ListNode atindex = new ListNode(val);
                atindex.next = t.next ;
                t.next = atindex ;

                // ListNode t1 = t.next ;
                // t.next = atindex ;
                // atindex.next = t1 ;
            }
    }

    public ListNode deletHead(){
        ListNode n = head;
        if(n == null) 
        return null;

        if(n != null){
            head = n.next ;
        }
        return n ;
    }

    public ListNode deleteatEnd(){
        if( head == null) return null ;
        
        ListNode p = head , q  = null , next = head.next ;
        if(next == null){
            head = null ;
            return p ;
        }

        while((next= p.next) != null){
            q = p ;
            p = next ;

        }
        q.next = null;
        return p ;

    }

    public ListNode deleteAtNode(){
        
    }
}
