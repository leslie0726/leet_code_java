package idv.lesliezou.algorithms;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int plus = 0;
        for (int index = digits.length - 1; index >= 0; index--) {
            if (index == digits.length - 1) {
                digits[index]++;
            }
            digits[index] += plus;
            plus = 0;
            if (digits[index] == 10) {
                digits[index] = 0;
                plus += 1;
            }
        }
        int[] result = new int[digits.length + plus];
        System.arraycopy(digits, 0, result, plus, digits.length);
        if (plus == 1) {
            result[0] = plus;
        }
        return result;

    }
}
