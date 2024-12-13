public class evenNo{
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumber(nums));
    }
    static int findNumber(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //function to check whether a number contain  even digit or not 
    static boolean even(int num){
        int numberofDigit = digits(num);
        // if(numberofDigit % 2 == 0){
        //     return true;
        // }
        // return false;
        return numberofDigit % 2 == 0;
    }
    
    //count number of digit ina a number 
    static int digits(int num){

        if(num < 0){
            num = num*-1;
        }
        if(num == 0){
            return 1;
        }


        
        int count = 0;
        while(num>0)
        {
            count++;
            num = num/10;
        }


        return count;
    }
}