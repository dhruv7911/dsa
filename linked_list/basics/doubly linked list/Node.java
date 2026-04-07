class Node{
    private int data;
    private Node next;
    private Node prev;
    public Node(int data){
        this.data = data;
        prev = next = null;
    }

    public static void main(String[] args){
        //create head node;
        Node head = new Node(10);
        //linking second node
        head.next = new Node(20);
        head.next.prev = head;
        //creating and linking third node
        head.next.next = new Node(30);
        head.next.next.prev = head.next;
        //createing and linking fourth node
        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next;
        //printing the linked list
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");

    }
}