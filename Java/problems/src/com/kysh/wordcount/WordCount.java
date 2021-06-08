package com.kysh.wordcount;

import java.util.*;

public class WordCount {

    public static void main(String[] args) {
        String target = "yellow green red red blue blue";
        Map<String, Integer> test = counting(target);
        for (String key : test.keySet()) {
            System.out.println(key+" "+test.get(key));
        }
    }

    public static Map<String, Integer> counting(String target) {
        Map<String, Integer> result = new LinkedHashMap<>();
        for (String x : target.split(" ")) {
            if (result.containsKey(x)) {
                result.put(x, result.get(x) + 1);
            } else {
                result.put(x, 1);
            }
        }
        return result;
    }
}