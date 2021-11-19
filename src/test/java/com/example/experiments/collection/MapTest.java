package com.example.experiments.collection;

import com.example.experiments.model.Employee;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {

    // NOTE:
    //  using equals and hashcode in conjunction with maps

    public static Logger log = LoggerFactory.getLogger(Employee.class);
    private static Map<String, String> asiaHashMap, asiaHashMapTwo, diffHashMap;
    private static Map<String, String[]> asiaArrayHashMap, asiaArrayHashMapTwo, diffArrayHashMap;

    @BeforeAll
    public static void Initialise() {
        asiaHashMap = new HashMap<String, String>();
        asiaHashMap.put("South Korea", "Seoul");
        asiaHashMap.put("Japan", "Tokyo");
        asiaHashMapTwo = new HashMap<String, String>();
        asiaHashMapTwo.put("Japan", "Tokyo");
        asiaHashMapTwo.put("South Korea", "Seoul");
        diffHashMap = new HashMap<String, String>();
        diffHashMap.put("Japan", "Tokyo");
        diffHashMap.put("South Korea", null);
        asiaArrayHashMap = new HashMap<String, String[]>();
        asiaArrayHashMap.put("South Korea", new String[] {"Seoul", "Busan"});
        asiaArrayHashMap.put("Japan", new String[] {"Tokyo", "Osaka"});
        asiaArrayHashMapTwo = new HashMap<String, String[]>();
        asiaArrayHashMapTwo.put("South Korea", new String[] {"Seoul", "Busan"});
        asiaArrayHashMapTwo.put("Japan", new String[] {"Tokyo", "Osaka"});
        diffArrayHashMap = new HashMap<String, String[]>();
        diffArrayHashMap.put("Japan", new String[] {"Tokyo", "Osaka"});
        diffArrayHashMap.put("South Korea", new String[] {});
    }

    @BeforeEach
    public void Setup() {

    }

    @Test
    public void TestHashMap_Equal_ShouldPass() {
        assertTrue(asiaHashMap.equals(asiaHashMapTwo));
    }

    @Test
    public void TestHashMap_NotEqual_ShouldFail() {
        assertFalse(asiaHashMap.equals(diffHashMap));
    }

    @Test
    public void TestHashMap_EqualKeys_ShouldPass() {
        assertTrue(asiaHashMap.keySet().equals(diffHashMap.keySet()));
    }

    //NOTE:
    // entryset(): return set view of <key, value> pairs
    // keyset(): return set view of all keys
    // values(): return collection view of all values

    @Test
    public void TestHashMap_EqualValues_ShouldPass() {
        assertTrue(asiaHashMap.values().containsAll(asiaHashMapTwo.values()));
    }

    @Test
    public void TestHashMapArray_NotEqual_ShouldFail() {
        assertEquals(printHashMap(asiaArrayHashMap), printHashMap(asiaArrayHashMapTwo));
        assertFalse(asiaArrayHashMap.equals(asiaArrayHashMapTwo)); // NOTE: compares reference of String[]
    }

    @Test
    public void TestHashMapArray_Equal_ShouldPass() {
        assertEquals(printHashMap(asiaArrayHashMap), printHashMap(asiaArrayHashMapTwo));
        assertTrue(equalHashMap(asiaArrayHashMap, asiaArrayHashMapTwo));
    }

    public String printHashMap(Map<String, String[]> hashmap) {
        StringBuilder sb = new StringBuilder();
        for(String country: hashmap.keySet()) {
            sb.append(country + "={");
            sb.append(Arrays.toString(hashmap.get(country)));
            sb.append("} ");
        }
        return sb.toString();
    }

    public boolean equalHashMap(Map<String, String[]> hm1, Map<String, String[]> hm2) {
        if(hm1.size() != hm2.size()) return false;

        return hm1.entrySet().stream()
                .allMatch(p -> Arrays.equals(p.getValue(), hm2.get(p.getKey())));
    }
}
