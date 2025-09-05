
import java.util.Scanner;

/**
 *
 * @author abhirup kumar ghosh
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array values : ");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\n1.Binary Search\n2.Linear Search\n3.Bubble Sort\n4.Selection sort\n5.Insertion sort\n6.Merge sort\nQuick sort");
        System.out.print("enter choice : ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Enter value to find : ");
                int valb = sc.nextInt();
                System.out.println("value found at index : [" + Search.binary_search(Sort.bubble_sort(arr), 0, arr.length, valb) + "] (Output by recursion)");
                System.out.println("value found at index : [" + Search.binary_Search(Sort.bubble_sort(arr), valb) + "] (Output by iteration)");
                break;
            case 2:
                System.out.println("Enter value to find : ");
                int vall = sc.nextInt();
                System.out.println("value found at index : [" + Search.linear_search(arr, vall, 0) + "] (Output by recursion )");
                System.out.println("value found at index : [" + Search.linear_Search(arr, vall) + "] (Output by iteration)");
                break;
            case 3:
                Sort.bubble_sort(arr);
                break;
            case 4:
                Sort.selection_sort(arr);
                break;
            case 5:
                Sort.insertion_sort(arr);
                break;
            case 6:
                Sort.merge_sort(arr, 0, arr.length - 1);
                System.out.print("Sorted array by Merge sort : ");
                for (int val : arr) {
                    System.out.print(val + " ");
                }
                System.out.print("\n");

            case 7:
                Sort.quick_sort(arr, 0, arr.length - 1);
                System.out.print("Sorted array by Quick sort : ");
                for (int val : arr) {
                    System.out.print(val + " ");
                }
                System.out.print("\n");
            default:
                break;
        }
        sc.close();
    }
}
