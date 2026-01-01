// package queue.implementation;

// public class Queue {
//     int front;
//     int rear;
//     int size;
//     int queue[] = new int[5];
//     public void enQueue(int data){
//         queue[rear]=data;
//         rear= (rear+1)%5;
//         size= size+1;
//     }
//     public void show(){
//         System.out.println("Elements:");
//         for(int i =0;i<size;i++){
//             System.out.print(queue[i]+" ");
//         }
//         System.out.println();
//     }
//     public int deQueue(){
//         if(isEmpty()){
//             System.out.println("Queue is empty");
//             return -1;
//         }else{
//             int data = queue[front];
//             front = (front+1)%5;
//             size = size-1;
//             return data;
//         }
//     }
//     public boolean isEmpty(){
//         return size==0;
//     }
// }

package queue.implementation;

public class Queue {
    int size;
    int[] queue = new int[5];
    int front;
    int rear;

    public boolean isEmpty() {
        return size == 0;
    }

    public void enQueue(int data) {
        if(size==5){
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = data;
        rear = (rear + 1) % 5;
        size = size + 1;

    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int element = queue[front];
            front = (front + 1)%5;
            size = size-1;
            return element;
        }
    }
    public void show(){
        System.out.println("front:"+front);
        System.out.println("rear:"+rear);
        for(int i=0;i<size;i++){
            System.out.println(queue[i]);
        }
    }

}
