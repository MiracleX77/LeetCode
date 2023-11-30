import java.util.Arrays;


public class S242 {
    public static boolean isAnagram(String s, String t) {
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();

        Arrays.sort(s_array);
        Arrays.sort(t_array);

        String s_str = new String(s_array);
        String t_str = new String(t_array);

        if(s_str.equals(t_str)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("mississippi","issipi"));
    }
}
