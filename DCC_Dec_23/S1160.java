package DCC_Dec_23;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class S1160 {
    public static int countCharacters(String[] words, String chars) {
        Map<Character,Integer> char_dict = count(chars);
        int result = 0;
        for (String str:words){
            Map<Character,Integer> dict_str = count(str);
            boolean isSubset = true;
            for(Map.Entry<Character,Integer> entry:dict_str.entrySet()){
                if (char_dict.containsKey(entry.getKey())){
                    if(entry.getValue() > char_dict.get(entry.getKey())){
                        isSubset = false;
                        break;
                    }
                }
                else{
                    isSubset = false;
                    break;
                }
            }
            if(isSubset){
                result+=str.length();
            }
        }
        return result;
    }

    public static Map<Character,Integer> count(String str){
        Map<Character,Integer> dict = new HashMap<>();
        for(int i=0;i<str.length();i++) {
            Character chat_at = str.charAt(i);
            if (dict.containsKey(chat_at)) {
                dict.replace(chat_at, dict.get(chat_at) + 1);
            } else {
                dict.put(chat_at, 1);
            }
        }
        return  dict;
    }
    public static void main(String[] args) {
        String[] word = {"cat","bt","hat","tree"};
        System.out.println(countCharacters(word,"atach"));
    }
}
