package de.szut.loos.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class MainInternalDatatype {
    public static void main(String args[]) {
        // Neue Map von Integer (komplex) auf String
        Map<Integer, String> testMap = new HashMap<>();
        populateMap(testMap);
        outputMap(testMap);
    }

    private static void outputMap(Map<Integer, String> testMap) {
        System.out.println(testMap.get(2));
        System.out.println(testMap.toString());
    }

    private static void populateMap(Map<Integer, String> testMap) {
        testMap.put(1, "eins");
        testMap.put(2, "zwei");
        testMap.put(3, "drei");
        testMap.put(4, "vier");
        testMap.put(5, "fuenf");
        testMap.put(6, "sechs");
    }
}
