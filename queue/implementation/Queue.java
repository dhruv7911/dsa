package queue.implementation;

public class Queue {
    int front;
    int rear;
    int size;
    int queue[] = new int[5];
    public void enQueue(int data){
        queue[rear]=data;
        rear= rear+1;
        size= size+1;
    }
    public void show(){
        System.out.println("Elements:");
        for(int i =0;i<size;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else{
            int data = queue[front];
            front = front+1;
            size = size-1;
            return data;
        }
    }
    public boolean isEmpty(){
        return size==0;
    }
}
