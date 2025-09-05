package Data_structure;

import java.util.Scanner;

public class Main {
    static void stack() {
        Scanner sc = new Scanner(System.in);
        System.out.println("SIZE : ");
        int n = sc.nextInt();
        Stack st = new Stack(n);
        int ch;
        do {
            System.out.println("-----STACK MANU-----\n1. push\n2. pop\n3. top\n4. display\n5. exit");
            System.out.print("choose any one : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Value : ");
                    int val = sc.nextInt();
                    st.push(val);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.top();
                    break;
                case 4:
                    st.disp();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("INVALID");
            }
        } while (ch != 5);
        sc.close();
        return;
    }

    static void queue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("SIZE : ");
        int n = sc.nextInt();
        Queue queue = new Queue(n);
        int ch;
        do {
            System.out.println("-----QUEUE MANU-----\n1. Enqueue\n2. Dequeue\n3. Peek\n4. Display\n5. Exit");
            System.out.print("choose any one : ");
            ch = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Value : ");
                    int val = sc.nextInt();
                    queue.enqueue(val);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.disp();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("INVALID");
            }
        } while (ch != 5);
        sc.close();
        return;
    }
    static void circular_que() {
        System.out.println("-----CIRCULAR QUEUE-----");
        Scanner sc = new Scanner(System.in);
        System.out.print("SIZE : ");
        int n = sc.nextInt();
        Circ_Queue cir = new Circ_Queue(n);
        int ch;
        do {
            System.out.println("\n-----CIRCULAR QUEUE MANU-----\n1. Enqueue\n2. Dequeue\n3. Peek\n4. Display\n5. Exit");
            System.out.print("choose any one : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Value : ");
                    int val = sc.nextInt();
                    cir.enqueue(val);
                    break;
                case 2:
                    cir.dequeue();
                    break;
                case 3:
                    cir.peek();
                    break;
                case 4:
                    cir.disp();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("INVALID");
            }
        } while (ch != 5);
        sc.close();
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("-----MAIN MANUE-----\n1. Stack\n2. Queue\n3. Circular queue\n4. Exit\nChoose : ");
        int n = sc.nextInt();

        do {
            switch (n) {
                case 1:
                    stack();
                    break;
                case 2:
                    queue();
                    break;
                case 3:
                    circular_que();
                    break;
                case 4:
                    System.out.println("Exiting Program...");
                default:
                    System.out.println("INVALID");
            }
        } while (n != 3);
        sc.close();

    }
}
