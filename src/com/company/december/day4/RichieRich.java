package com.company.december.day4;

public class RichieRich {

    /*
     * Complete the 'highestValuePalindrome' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER n
     *  3. INTEGER k
     */
    public static String highestValuePalindrome(String s, int n, int k) {
        if (n==1 ){
            if(k>0)
                return "9";
            return "-1";
        }
        double halfD = (n % 2 == 0 ? n / 2.0 : (n + 1) / 2.0);
        int half = (int) Math.ceil(halfD);
        int last = n - 1;
        char[] arr = new char[n];
        int countNotRight = 0;
        for (int i = 0; i < half; i++) {
            if (s.charAt(i) != s.charAt(last - i)) {
                // count the instances to replace to form a palindrome
                countNotRight++;
                arr[i] = '9';
                arr[last - i] = '9';
            } else {
                arr[i] = s.charAt(i);
                arr[last - i] = s.charAt(last - i);
            }
        }
        if (countNotRight > k) {
            return "-1";
        }
        int i = 0;

        while (i <= half && k > 0) {
            if ((k == 1) && (n % 2 != 0)) {
                arr[half] = '9';
                break;
            }
            if (s.charAt(i) != '9' && (k % 2 == 0)) {
                arr[i] = '9';
                arr[i + half] = '9';
                k--;
            }
            i++;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String s = "932239";
        String result = highestValuePalindrome(s, s.length(), 2);
        System.out.println(result);
    }
}
