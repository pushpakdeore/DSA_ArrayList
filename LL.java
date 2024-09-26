package p1ArrayList;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data =data;
        this.next=null;
    }
}
public class LL {
    Node head;
    LL(){
        head =null;
    }
    public void addlast(int data){
        Node newnode = new Node(data);
        if(head ==null){
            head=newnode;
        }else {
            Node curr = head;
            while (curr.next!=null){ //next
                curr=curr.next;
            }
            curr.next=newnode;
        }
    }
    public void deletefirst(){
        head =head.next;

    }
    //2. Reverse a LinkedList:
    public void revese(){
        Node curr =head;
        Node prev =null;

        while (curr!=null){
            Node temp =curr.next; //store due to loss of connection
            curr.next=prev;
            prev =curr;
            curr=temp;
        }head =prev;


    }
    public void disply(){
        Node cur =head;
        while (cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
    //3. Detect a Cycle in a LinkedList:
    public boolean detectcycle(Node head){
        Node fast =head;

        Node slow =head;
        while (fast!=null && fast.next!=null ){
            slow =slow.next;
            fast =fast.next.next;
            if(slow==fast){
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        LL list   =new LL();
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.addlast(5);
        list.addlast(6);
        list.deletefirst();

        list.revese();
        list.disply();

        Node head =new Node(2);
        head.next =new Node(3);
        head.next.next =new Node(4);
        head.next.next.next=new Node(5);
        head.next.next.next.next =head.next.next;

        System.out.println(list.detectcycle(head));





    }
}
