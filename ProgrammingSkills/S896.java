package ProgrammingSkills;

import java.util.Arrays;
import java.util.Comparator;

public class S896 {
    public  static boolean isMonotonic(int[] nums) {
        Integer[] nums_n = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Integer[] sort_in = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Integer[] sort_de = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(sort_in);
        Arrays.sort(sort_de,Comparator.reverseOrder());
        return Arrays.equals(sort_de, nums_n) || Arrays.equals(sort_in,nums_n);

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(isMonotonic(nums));
    }
}
