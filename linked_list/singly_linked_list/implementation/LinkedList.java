package implementation;

public class LinkedList {
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void print(){
        Node n = head;
        while(n.next!=null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
    public void removeByData(int data){
        Node n = head;
        if(head==null){
            return;
        }
        if(head.data == data){
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next!=null){
            if(current.next.data==data){
                current.next=current.next.next;
                return;
            }
            current = current.next;
        }
    }
}

