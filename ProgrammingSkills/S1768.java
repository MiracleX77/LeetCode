public class S1768 {
  public static String mergeAlternately(String word1, String word2) {
    int count = word1.length();
    int count_max = Math.max(count, word2.length());
    String str = word1 + word2;
    String result = "";
    for(int i = 0;i< count_max;i++){
      if(i<word1.length()){
        result+=str.charAt(i);
      }
      if(i<word2.length()){
        result+=str.charAt(count+i);
      }
    }
    return result;
  }
  
  public static void main(String[] args) {
    String data = mergeAlternately("ab", "pqrs");
      }




}