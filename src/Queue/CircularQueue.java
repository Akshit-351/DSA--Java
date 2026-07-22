package Queue;

public class CircularQueue {
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
            return (rear + 1) % size == front;
        }

        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
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
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return removed;
        }



        public void display() {
            if (isEmpty()) {
                System.out.println("Queue Underflow");
                return;
            }
            System.out.println("The current Element in Queue are: ");
            int i = front;
            //System.out.println(arr[i]);

            while (true) {
                System.out.print(arr[i] + " ");

                if (i == rear)
                    break;

                i = (i + 1) % size;
            }
            System.out.println();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Underflow");
                return -1;
            }
            int peek = arr[front];
            System.out.println("The element at front is: ");
            return peek;
        }
    }

        public void main(String[] args) {
            Queue q = new Queue(5);
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);

            q.dequeue();
            q.dequeue();

            q.enqueue(60);
            q.enqueue(70);
            System.out.println(q.dequeue());
            q.display();
            System.out.println(q.peek());
        }
    }
