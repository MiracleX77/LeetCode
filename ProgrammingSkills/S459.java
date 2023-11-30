public class S459 {
    public static boolean repeatedSubstringPattern(String s) {
        if(s.length() == 1){
                return false;
            }
        for(int i = s.length()/2;i>0;i--){
            if(s.length()%i==0){
                int count_substr = s.length()/i;
                for (int j = 1;j<count_substr;j++){
                    String first_str = s.substring(0, i);                        if(s.substring(i*j,i*(j+1)).equals(first_str)){
                        if(j == count_substr-1){
                            return true;
                        }
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("aba"));
    }




}