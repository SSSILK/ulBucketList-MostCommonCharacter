import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for ( int i = 0; i < str.length(); i++){
             char c = str.charAt(i);
            if (map.containsKey(c)){
               map.put(c, map.getOrDefault(c, 0)+ 1);
        }
        else map.put(c, 1);
        }

        int max = 0;
        char common = ' ';

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();
            if( value > max ){
                max = value;
               common = key;
            }



    }
   return common;
}

}

