package de.szut.loos.mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainOwnDatatype {
    public static void main(String args[]) {
        // Neue Map von Integer (komplex) auf String
        Map<Coordinate, Color> testMap =
                new TreeMap<>();
        populateMap(testMap);
        outputMap(testMap);
    }

    private static void outputMap(Map<Coordinate, Color> testMap) {
        System.out.println(testMap.get(2));
        System.out.println(testMap.toString());
    }

    private static void populateMap(Map<Coordinate, Color> testMap) {
        testMap.put(new Coordinate(1, 1),
                new Color(0x12, 0x12, 0x44));
    }
}