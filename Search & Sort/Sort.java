
class Print {

    public void printArray(int[] arr, String name) {
        System.out.print("Sorted array by " + name + "sort : ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.print("\n");
    }
}

public class Sort {

    static int[] bubble_sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;                 //[1, 3, 5, 7, 9]
            for (int j = 0; j < n - 1 - i; j++) {               // 0  1  2  3  4
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        Print b = new Print();
        b.printArray(arr, "Bubble");

        return arr;
    }

    static int[] selection_sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int loc = i;
            for (int j = i + 1; j < n; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    loc = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[loc];
            arr[loc] = temp;
        }

        Print s = new Print();
        s.printArray(arr, "Selection");

        return arr;
    }

    static int[] insertion_sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;                        //     key=4
            while (j >= 0 && arr[j] > key) {         //1 2 3 4 5 
                arr[j + 1] = arr[j];              //    j    i
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        Print i = new Print();
        i.printArray(arr, "Insertion");

        return arr;
    }

    static void merge_sort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (end + start) / 2;
            merge_sort(arr, start, mid);
            merge_sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static int[] merge(int[] arr, int start, int mid, int end) {
        int[] b = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int x = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                b[x++] = arr[i++];
            } else {
                b[x++] = arr[j++];
            }
        }
        while (i <= mid) {
            b[x++] = arr[i++];
        }
        while (j <= end) {
            b[x++] = arr[j++];
        }
        for (int k = 0; k < b.length; k++) {
            arr[start + k] = b[k];   // only update [start..end]
        }
        return arr;
    }

    static void quick_sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            quick_sort(arr, low, pivot - 1);
            quick_sort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i;
    }
}
