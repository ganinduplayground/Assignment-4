import java.util.Arrays;
import java.util.Scanner;

public class Algo4 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        int y;
        if(nums.length%2==0){
            y = nums.length/2;
        }else y = nums.length/2 + 1;

        for (int i = 0; i < y; i++) {
            int x = nums[i];
            nums[i] = nums[nums.length-(1+i)];
            nums[nums.length-(1+i)] =x;
        }

        System.out.println(Arrays.toString(nums));
    }
}

