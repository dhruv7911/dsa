class Node{
    private int data;
    private Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    public static void main(String[] args){
        //create the first node;
        Node head = new Node(10);
        //Link the second node;
        head.next = new Node(20);
        //Link the third node
        head.next.next = new Node(30);
        //Link the fourth node
        head.next.next.next = new Node(40);

        //printing the linked list
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    
}