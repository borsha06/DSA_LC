import java.math.BigInteger;

class Solution {
    List<Integer> arrs = new ArrayList<>();

    public int[] plusOne(int[] digits) {

        BigInteger num;

        int length = digits.length;
        String str = "";
        for (int i = 0; i < length; i++) {
            str += digits[i];
        }
        BigInteger dig = new BigInteger(str);
        BigInteger sum = new BigInteger("1");

        num = dig.add(sum);

        findDigit(num);

        int[] numbersArray = new int[arrs.size()];
        for (int i = 0; i < arrs.size(); i++) {
            numbersArray[i] = arrs.get(i);
        }

        return numbersArray;

    }

    public List<Integer> findDigit(BigInteger digit) {

        BigInteger rem;

        while (!(digit.equals(BigInteger.ZERO))) {
            rem = digit.remainder(new BigInteger("10"));
            digit = digit.divide(new BigInteger("10"));
            arrs.add(rem.intValue());
        }
        Collections.reverse(arrs);
        return arrs;

    }
}