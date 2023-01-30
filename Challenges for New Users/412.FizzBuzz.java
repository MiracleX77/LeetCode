import java.util.ArrayList;
import java.util.List;

class Solution412 {
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            list.add(i % 15 == 0 ? "FizzBuss" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buss" : String.valueOf(i));
            // if (i % 3 == 0 && i % 5 == 0) {
            // list.add("FizzBuzz");
            // } else if (i % 3 == 0) {
            // list.add("Fizz");
            // } else if (i % 5 == 0) {
            // list.add("Buzz");
            // } else {
            // list.add(Integer.toString(i));
            // }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}