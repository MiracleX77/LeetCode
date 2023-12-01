import java.util.Arrays;

public class S283 {
    public static int[] moveZeroes(int[] nums) {
        int index_zero =0;
        int pre_num ;
        for (int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                pre_num = nums[index_zero];
                nums[index_zero] = nums[i];
                nums[i] = pre_num;
                index_zero++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] num = {1};
        System.out.println(moveZeroes(num).toString());
    }
}
