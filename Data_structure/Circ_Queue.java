package Data_structure;

public class Circ_Queue {
    static int arr[];
    public int size;
    int front = -1;
    int rear = -1;

    Circ_Queue(int n) {
        arr = new int[n];
        this.size = n;
    }

    public void enqueue(int item) {
        if ((front == 0 && rear == size - 1) || (front == rear + 1)) {
            System.out.println("OVERFLOW !");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        }

        else if (front != 0 && rear == size - 1) {
            rear = 0;
        } else {
            rear = rear + 1;
        }
        arr[rear] = item;
        System.out.println(arr[rear] + " Enqueued\n");
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("UNDERFLOW !");
            return;
        }
        System.out.println(arr[front] + " Dequeued\n");
        if (front == rear) {
            front = rear = -1;
        } else if (front == size - 1) {
            front = rear = 0;
        } else {
            front = front + 1;
        }
    }

    public void disp() {
        if (front == -1) {
            System.out.println("UNDERFLOW !");
            return;
        }
        System.out.print("\n[ ");
        if (front > rear) {
            for (int i = front; i <= size - 1; i++) {
                System.out.print(arr[i]);
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }

        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i]);
            }
        }
        System.out.println("]\n");
    }

    public void peek(){
        if (front == -1) {
            System.out.println("UNDERFLOW !");
            return;
        }
        System.out.println(arr[front]);
    }
}
