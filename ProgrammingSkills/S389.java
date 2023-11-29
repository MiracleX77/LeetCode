public class S389 {
    public static char findTheDifference(String s, String t) {
        int sum_sbyte =0;
        int sum_tbyte =0;

        for (byte sb : s.getBytes()){
            sum_sbyte+=sb;
        }
        for (byte tb: t.getBytes()){
            sum_tbyte+=tb;
        }
        return (char) (sum_tbyte-sum_sbyte);
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("ab", "ab1"));
    }




}