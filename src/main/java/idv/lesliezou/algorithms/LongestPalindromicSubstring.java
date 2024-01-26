package idv.lesliezou.algorithms;


public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String result = s.substring(0, 1);
        for (int center = 1; center < s.length(); center++) {
            boolean flag1 = true;
            boolean flag2 = true;

            for (int shift = 1; isValidIndex(s, center, shift); shift++) {
                int max = center + shift;
                int max2 = center + shift - 1;
                int min = center - shift;

                if (flag1 && isPalindromicSubstring(s, max, min)) {
                    result = updateMaxResult(s, min, max, result);
                } else {
                    flag1 = false;
                }

                if (flag2 && isPalindromicSubstring(s, max2, min)) {
                    result = updateMaxResult(s, min, max2, result);
                } else {
                    flag2 = false;
                }

                if (!flag1 && !flag2) {
                    break;
                }
            }
        }
        return result;
    }

    private static boolean isPalindromicSubstring(String s, int max, int min) {
        return max != s.length() && s.charAt(min) == s.charAt(max);
    }

    private static boolean isValidIndex(String s, int center, int shift) {
        int min = center - shift;
        int max = center + shift;
        return min >= 0 && max <= s.length();
    }

    private static String updateMaxResult(String s, int minIndex, int maxIndex, String result) {
        String find = s.substring(minIndex, maxIndex + 1);
        result = (find.length() > result.length() ? find : result);
        return result;
    }


}