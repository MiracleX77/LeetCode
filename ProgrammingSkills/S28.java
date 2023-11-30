public class S28 {
    public static int strStr(String haystack, String needle) {
        int count_needle = needle.length();
        for(int i = 0;i<haystack.length();i++){
            if(haystack.length()-i >= count_needle)
                for(int j = 0;j<count_needle;j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        break;
                    }
                    else{
                        if (j==count_needle-1){
                            return i;
                        }
                    }
                }
            else{
                return -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi","issipi"));
    }
}
