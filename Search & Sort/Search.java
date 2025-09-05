public class Search {
    static int linear_search(int[] arr, int val, int i) {
        if (arr[i] == val)
            return i;
        else if (arr[i] != val)
            return linear_search(arr, val, ++i);
        else
            return -1;
    }

    static int linear_Search(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val)
                return i;
        }
        return -1;
    }

    public static int binary_search(int[] arr,int low, int high, int val){

        if(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==val) return mid;
            if(arr[mid]>val) return binary_search(arr,low,mid-1,val);
            if(arr[mid]<val) return binary_search(arr,mid+1,high,val);
        }
        return -1;
    }
    public static int binary_Search(int[] arr, int val){
        int low = 0 ;
        int high = arr.length;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]==val) return mid;
            else if(arr[mid]>val) high=mid-1;
            else if(arr[mid]<val) low=mid+1;
        }
        return -1;
    }

}
