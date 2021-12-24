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
        int half = (int) (n % 2 == 0 ? n / 2.0 : (n + 1) / 2.0);
        int last = n - 1;
        char[] arr = new char[n];
        int countNotRight = 0;
        for (int i = 0; i < half; i++) {
            if (s.charAt(i) != s.charAt(last - i)) {
                // count the instances to replace to form a palindrome
                countNotRight++;
                arr[i] = '9';
                arr[last-i] = '9';
            }else {
                arr[i] = s.charAt(i);
                arr[last - i] = s.charAt(last - i);
            }
        }
        int i =0;
        while (i<=half){
            for (int i = 0; i < half; i++) {

            }
        if (countNotRight > k){
            return "-1";
        }

        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String s = "932239";
        String result = highestValuePalindrome(s, s.length(), 2);
        System.out.println(result);
    }
}
