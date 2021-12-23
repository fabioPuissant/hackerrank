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
        String s = encryption("chillout");
        //System.out.println(s);
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
                    System.out.printf("%c", s.charAt(idx));
                    sb.append(s.charAt(idx));
                }
            }
            System.out.printf(" ");
        }
        return sb.toString();
    }

    private static String encryption3(String s) {
        s = s.replaceAll(" ", "");
        double sqrt = Math.sqrt(s.length());
        int cols = (int) Math.ceil(sqrt);
        int rows = (int) sqrt;
        if (rows*cols < s.length()){
            rows=cols;
        }
        String[] table = new String[rows];
        int idx = 0;
        for (int i = 0; i <rows; i++) {
            table[i] = s.substring(idx,idx+cols);
            idx+=cols;
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < cols; j++) {
            for(int i=0; i< table.length; i++){
                sb.append(table[i].charAt(j));
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    private static String encryption2(String s) {
        s = s.replaceAll(" ", "");
        double sqrt = Math.sqrt(s.length());
        int ceil = (int) Math.ceil(sqrt);
        int floor = (int) sqrt;
        //System.out.printf("Ceil: %d, floor: %d%n", ceil,floor);
        String[][] table = new String[floor][ceil];
       // int count = 0;
        for (int i = 1; i <= floor; i++) {
            for (int j = 1; j <= ceil; j++) {
                int count = i* j-1;
                if (count < s.length()) {
                    table[i-1][j-1] = s.charAt(count) + "";
                } else {
                    table[i][j] = "";
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < ceil; j++) {
            for (int i = 0; i < floor; i++) {
                builder.append(table[i][j]);
            }
            builder.append(" ");
        }

        return builder.toString();
    }
}
