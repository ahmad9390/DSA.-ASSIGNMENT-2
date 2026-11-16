class Queue {
    int front = -1,
            rear = -1;
    int size = 5;
    int arr[] = new int[size];

    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow! No space.");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = x;
            System.out.println(x + " added in queue");
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow! Queue is empty.");
        } else {
            System.out.println(arr[front] + " removed from queue");
            front++;
        }
    }

    void showFront() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element is: " + arr[front]);
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.showFront();
        q.dequeue();
        q.display();
    }
}
