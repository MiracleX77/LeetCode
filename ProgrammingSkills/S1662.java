public class S1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 ="";
        for (String i : word1){
            str1+=i;
        }
        for (String i : word2){
            str2+=i;
        }
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        String[] word1={"ab","c"};
        String[] word2={"a","bc"};

        System.out.println(arrayStringsAreEqual(word1,word2));
    }
}
