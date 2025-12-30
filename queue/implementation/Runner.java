package queue.implementation;

public class Runner {
    public static void main(String[] args){
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.show();
    }
}
