package com.aca.classwork.classwork18.map.exampleMap;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("DELL", 2000);

        Integer dell = map.get("DELL");
        System.out.println(dell);
    }
}
