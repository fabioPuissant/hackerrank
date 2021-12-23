package com.company.december.day3;

import java.io.IOException;
import java.util.stream.Stream;

public class Encryption {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
        String s = "have a nice day";
        s = encryption("chillout");
        System.out.println(s);
    }

    private static String encryption(String s) {
        s = s.replaceAll(" ", "");
        double sqrt = Math.sqrt(s.length());
        int cols = (int) Math.ceil(sqrt);
        int rows = (int) sqrt;
        if (rows * cols < s.length()) {
            rows = cols;
        }
        StringBuilder sb = new StringBuilder();
        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows; r++) {
                int idx = c + r * cols;
                if (idx < s.length()) {
                    sb.append(s.charAt(idx));
                }
            }
            sb.append(" ");
        }
        return sb.toString();
    }

}
