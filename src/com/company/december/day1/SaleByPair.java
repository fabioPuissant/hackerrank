package com.company.december.day1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaleByPair {

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> map = new HashMap<>();
        int pairs = 0;
        for (Integer sock : ar) {
            int count = map.get(sock) == null ? 1 : map.get(sock) + 1;
            pairs = count % 2 == 0 ? pairs + 1 : pairs;
            map.put(sock, count);
        }
        return pairs;
    }

}
