package idv.lesliezou.algorithms;

//import java.util.Scanner;

public class Exam {
    public static String decipher(String ciphertext, String knownWord) {
        String[] words = ciphertext.split(" ");
        int step = 0;
        for (String word : words) {
            if (word.length() == knownWord.length()) {
                step = (int) word.charAt(0) - (int) knownWord.charAt(0);
                StringBuilder tmp = new StringBuilder();
                for (int index = 0; index < word.length(); index++) {
                    tmp.append((char) ((int) knownWord.charAt(index)) + step);
                }
                if (word.contentEquals(tmp)) break;
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : ciphertext.toCharArray()) {
            result.append(isLetter(c) ?
                    isLetter((char) (((int) c) - step)) ?
                            (char) (((int) c) - step) : (char) (((int) c) - step + 26)
                    : c);
        }
        return result.toString();
    }

    public static boolean isLetter(char c) {
        // 65 = A, 90 = B, 97 = a, 122 = z
        return ((int) c >= 65 && (int) c <= 90) || ((int) c >= 97 && (int) c <= 122);
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String ciphertext = "cdeb nqxg"; // hello world!
//        String knownWord = "love"; // hello world!
//
//        String result = decipher(ciphertext, knownWord);
//        System.out.println(result);
    }




    public String solution(String S, String T) {
        if(S.equals(T)) {
            return "NOTHING";
        }
        if (T.length() - S.length() == 1 && S.equals(T.substring(1))){
            return "INSERT "+T.charAt(0);
        }
        int swapIndex = 0;
        boolean alreadyDiff = false;
        for(int index =0;index<S.length();index++){

            if(S.charAt(index) != T.charAt(index)){
                if (alreadyDiff){
                    return "SWAP "+T.charAt(index)+" "+T.charAt(swapIndex);
                } else {
                    swapIndex = index;
                    alreadyDiff = true;
                }

                if(S.replaceAll(String.valueOf(S.charAt(index)),String.valueOf(T.charAt(index))).equals(T)) {
                    return "CHANGE "+S.charAt(index)+" "+T.charAt(index);
                }
            }
        }
        return "IMPOSSIBLE";
    }

}
