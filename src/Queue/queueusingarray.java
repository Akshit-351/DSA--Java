package Queue;

public class queueusingarray {
    class Queue {
        int arr[];
        int size;
        int front;
        int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public boolean isEmpty() {
            return front == -1;
        }

        public boolean isFull() {
            return rear == size - 1;
        }

        //Enqueue
        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue Overflow");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = data;
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue Underflow");
                return -1;
            }
            int removed = arr[front];
            if (front == rear) {
                front = -1;
                front = -1;
            }else {
                front++;
            }
            return removed;
        }
        public int peek(){
            if (isEmpty()) {
                System.out.println("Queue Underflow");
                return -1;
            }
            int peek = arr[front];
            return peek;
        }
        public void display(){
                if (isEmpty()) {
                    System.out.println("Queue Underflow");
                    return ;
                }
            System.out.println("The current Element in Queue are: ");
            for(int i = front; i<rear; i++){
                System.out.println(arr[i] +" ");
                }
            System.out.println();
        }
    }

    public void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        System.out.println("The element at front will removed : " +q.dequeue());
        System.out.println("The current element at front after delete : "+ q.peek());
        q.display();
    }
}
