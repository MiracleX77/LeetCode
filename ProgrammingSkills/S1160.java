package ProgrammingSkills;

import java.util.Arrays;

public class S1160 {
    public static int[] moveZeroes(int[] numbs) {
        int index_zero =0;
        int pre_num ;
        for (int i = 0;i<numbs.length;i++){
            if(numbs[i] != 0){
                pre_num = numbs[index_zero];
                numbs[index_zero] = numbs[i];
                numbs[i] = pre_num;
                index_zero++;
            }
        }
        return numbs;
    }

    public static void main(String[] args) {
        int[] num = {1};
        System.out.println(Arrays.toString(moveZeroes(num)));
    }
}
