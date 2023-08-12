public class Algo2 {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23} ;

        int small = 0;
        int large = 0;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if(n<nums[j]){
                    if(small>n)
                     small = n;
                }
            
                else {
                    if(large<nums[j]){
                    large = nums[j];
                    }
                }
            }
        }

        System.out.printf("Smallest number: %s \nLargest number: %s\n", small,large);
    }
}
