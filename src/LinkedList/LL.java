package LinkedList;

public class LL {
    private static Node head;
    private static Node tail;

    public static void main(String[] args) {
LL list =new LL();

        list.addElement(1);
        list.addElement(10);
        list.addElementLast(3);
        list.addElementLast(4);
        list.addElementLast(5);
        list.addElementLast(6);
        list.addElementLast(8);
        addElementOnIndex(9, 3);
        list.display(head);

    }






    public void display(Node head)
    {
        Node temp= head;

        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }



    public static Node addElement(int data){

        Node node= new Node(data);
        node.next=head;
        head = node;

        if(tail==null)
        {
            tail =head;
        }
        return head;
    }


    public static Node addElementLast(int data){

        if(tail==null)
        {
            head = new Node(data);
            tail= head;
        }
        else {
            Node node = new Node(data);
            tail.next = node;
            tail = node;
        }
        return head;
    }


    static Node addElementOnIndex(int value, int idx)
    {
        Node temp = head;
        int i=0;
        while(i!=idx-1)
        {
            temp=temp.next;
            i++;
        }

        Node node  = new Node(value);
        node.next=temp.next;
        temp.next= node;
        return head;
    }


}






 class Node{

    int value ;
    Node next;


    public Node(int value){
        this.value=value;
        this.next=null;
    }
}
