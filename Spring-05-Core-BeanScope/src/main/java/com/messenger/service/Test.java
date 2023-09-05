package com.messenger.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("1", "Kiril");

        String str = (String) map.get("1");
        System.out.println(str.toUpperCase());

        Map<String, String> stringMap = map.entrySet().stream()
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> (String) entry.getValue()
                ));
        System.out.println("stringMap.get(\"1\") = " + stringMap.get("1").toUpperCase());


    }
}
