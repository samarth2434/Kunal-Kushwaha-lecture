public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {2,33,56,87,98,345};
        int target = 98;
        int ans = binarySearch(arr, target);
        System.out.println("my target index is: " + ans);
    }
    //return the index 
    // return -1 if it does not exist 
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //find the element
            // int mid = (start + end)/2; // this line provide error when it might be possible that (start + end) exceeds the range of int in java 
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                //left 
                end = mid - 1;
            }
            else if(target > arr[mid]){
                //it exist in right side 
                start = mid + 1;
            }
            else{
                //found my ans 
                return mid;
            }
        }
        return -1;  // it means the target element does not exist in the arr
        
    }
}