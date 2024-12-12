public class searchinRange{
    public static void main(String[] args) {
        int[] arr = {12,3,4,6,8,5};
        int target = 6;
        System.out.println(linearSearch(arr, target, 1, 4));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
            if(arr.length == 0){
                return -1;
            }
            //run a for loop
            for (int i = start; i <= end; i++) {
                //check for element at every index if it is = target 
                int element = arr[i];
                if(element == target){
                    return i;
                }
            }
        
           // this line will execute if none of the return statments above have executed 
           // hence target not found 
           return -1;
    }

}
