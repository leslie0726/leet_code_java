package idv.lesliezou.algorithms;

import java.util.Arrays;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        return s.split(" ")[s.split(" ").length-1].length();
    }
}
