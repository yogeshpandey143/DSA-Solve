package LinkedList;

public class DoubliLL {

    static Node head;
   static Node tail;


    public static void main(String[] args) {

        DoubliLL dl = new DoubliLL();
      dl.addAtLast(1);
        dl.addAtLast(3);
        dl.addAtLast(6);

        dl.displayPrev(head);
    }




    public void displayNext(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void displayPrev(Node head)
    {
        Node temp = tail;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.prev;
        }
    }


    public Node addAtLast(int value) {

        Node node =new Node(value);
        if(tail==null){
            head = node;
            tail=head;
            head.next = null;
            head.prev = null;

        }
        else{
            tail.next= node;
            node.prev=tail;
            tail=node;
        }







        return head;
    }


    class Node{
        int value;
        Node next;
        Node prev;


       public Node(int value){
            this.value=value;
            this.next=null;
            this.prev=null;

        }

    }
}
