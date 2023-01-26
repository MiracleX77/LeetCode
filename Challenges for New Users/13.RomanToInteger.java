import java.util.Hashtable;

class Solution13 {
    public static int romanToInt(String s) {
        Hashtable<Character, Integer> dict = new Hashtable<Character, Integer>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = dict.get(s.charAt(i));
            if (i <= s.length() - 2) {
                int value_next = dict.get(s.charAt(i + 1));
                if (value < value_next) {
                    sum += (value_next - value);
                    i++;
                } else {
                    sum += value;
                }
            } else {
                sum += value;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}