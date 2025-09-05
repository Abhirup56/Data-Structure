package Data_structure;

public class Queue {

    static int arr[];
    public int size;
    int front = -1;
    int rear = -1;

    Queue(int n) {
        arr = new int[n];
        this.size = n;
    }

    public void enqueue(int item) {
        if (rear == size - 1) {
            System.out.println("OVERFLOW !");
        } else {
            if (front == -1 || front > rear) {
                front = rear = 0;

            } else {
                rear = rear + 1;
            }
            arr[rear] = item;
            System.out.println(item + " Enqueued\n");

        }
    }

    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("UNDERFLOW \n");
            return;
        }
        System.out.println(arr[front] + " Dequeued\n");
        front = front + 1;
    }

    public void peek() {
        if (front == -1 || front > rear) {
            System.out.println("UNDERFLOW\n");
            return;
        }
        System.out.println("Peek : " + arr[front]);
    }

    public void disp() {
        if (front == -1 || front > rear) {
            System.out.println("UNDERFLOW\n");
            return;
        }
        System.out.print("\n [");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println("] \n");
    }
}
