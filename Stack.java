class Stack {
    int top = -1;
    int size = 5;
    int arr[] = new int[size];

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow! No space.");
        } else {
            top++;
            arr[top] = x;
            System.out.println(x + " pushed in stack");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Stack is empty.");
        } else {
            System.out.println(arr[top] + " popped from stack");
            top--;
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + arr[top]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}