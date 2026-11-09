package main.java.agh.po.lab3;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CodingBatTest {

    @Test
    void mapAB4() {
        CodingBat cb = new CodingBat();
        Map<String, String> input1 = new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"));
        Map<String, String> expected1 = Map.of("c", "cake");
        assertEquals(expected1, cb.mapAB2(input1));
    }

    @Test
    void pairs() {
    }
}