package ProgrammingSkills;

import java.util.Arrays;

public class S1502 {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        float n,sum_diff = 0;
        int sum = 0;
        if(arr.length>=2){
            int diff = arr[1]-arr[0];
            n = arr.length;
            sum_diff = (float) ((n/2.0)*((2*arr[0])+((n-1)*diff)));

            sum = 0;
            for (int i = 0;i<n;i++){
                sum+=arr[i];
            }
            System.out.println(sum);
            System.out.println(sum_diff);
        }
        return (sum_diff == sum);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,5,5};
        System.out.println(canMakeArithmeticProgression(arr));
    }
}
