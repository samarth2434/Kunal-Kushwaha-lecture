public class OrderAgnosticBS{
    public static void main(String[] args) {
        // int[] arr = {2,4,6,8,10,12,14,16,18};
        int[] arr = {100,90,80,70,60,50,40,30,20,10};
        int target = 10;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //first step if to find the arr is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            //find the element
            // int mid = (start + end)/2; // this line provide error when it might be possible that (start + end) exceeds the range of int in java 
            int mid = start + (end - start)/2;

            //common for ascending and descending 
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                //left 
                end = mid - 1;
            }
            else {
                //it exist in right side 
                start = mid + 1;
            }
        }
        else{
            if(target > arr[mid]){
                //left 
                end = mid - 1;
            }
            else {
                //it exist in right side 
                start = mid + 1;
            }
        }

        }
        return -1;  // it means the target element does not exist in the arr
        
    }
}