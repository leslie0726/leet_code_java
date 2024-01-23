package idv.lesliezou.algorithms;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int currentLength = 0;
        int checkPoint = 0;
        for (int index = 0; index < s.length(); index++) {
            char[] sArray = s.toCharArray();
            if (map.containsKey(sArray[index]) && map.get(sArray[index]) >= checkPoint) {
                int repeatIndex = map.get(sArray[index]);
                currentLength = (index+1) - (repeatIndex+1);
                checkPoint = Integer.max(checkPoint, map.get(sArray[index]));
            } else{
                currentLength ++;
            }
            map.put(sArray[index],index);
            maxLength = Integer.max(maxLength, currentLength);
        }
        return maxLength;
    }
}
