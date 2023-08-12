import java.util.Arrays;

public class Algo3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int[] newArray = new int[nums.length];
        int y;
        if(nums.length%2==0){
            y = nums.length/2;
        }else y = nums.length/2 + 1;

        for (int i = 0; i < y; i++) {
            int x = nums[i];
            newArray[i]= nums[nums.length-(1+i)];
            newArray[nums.length-(1+i)]=x;
        }

        nums=newArray;
    System.out.println(Arrays.toString(nums));
    }
}
