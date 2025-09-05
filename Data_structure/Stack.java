package Data_structure;
// Stack : stack is a one-ended abstruct data structure which works on LIFO principal. the last item inserted will be the first item to be deleted. it has verious use cases : recursion, dfs, infix-postfix-prefix, reversing, sequencing etc. 
public class Stack {
    //configuration : declarer the SIZE of the array , array , top= -1.
    public int size;
    public static int[] arr;
    public static int top = -1;

    Stack(int n){
        arr = new int[n];
        this.size=n;
    }

    //Push method is used to insert a element in to stack . we check overflow condition or check the stack has any empty space or not if it false we perform push operation. 
    public void push(int n){
        if(top==size-1){
            System.out.println("OVERFLOW");
        }
        else{
            top = top+1;
            arr[top]=n;
            System.out.println("Item pushed");
        }
    }

    //Pop is used to delete the top most item in the stack. we check the underflow condition first if its false we print it. 
    public void pop(){
        if(top==-1){
            System.out.println("UNDERFLOW");
        }else{
            System.out.println(arr[top] + "popped");
            top=top-1;
        }
    }

    // Top method is used to print the top most element in the stack. we check the underflow condition first if its false we print it.
    public void top(){
        if(top==-1){
            System.out.println("UNDERFLOW");
        }
        else{
            System.out.println(arr[top]);
        }
    }
    // display method is used to print all the item in the stack. we check the underflow condition first if its false we print it.
    public void disp(){

        if(top==-1){
            System.out.println("UNDERFLOW");
        }else{
            System.out.print("[");
            for(int i=0; i<=top; i++){   // ✅ sirf stack ke elements print karo
                System.out.print(arr[i] + " ");
            }
            System.out.println("]");
            System.out.println(" ");
        }
    }
    
}
