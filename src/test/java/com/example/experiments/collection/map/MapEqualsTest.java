//package com.example.experiments.collection.map;
//
//import com.example.experiments.model.Employee;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class MapEqualsTest {
//
//    // NOTE:
//    //  using equals and hashcode in conjunction with maps
//
//    public static Logger log = LoggerFactory.getLogger(Employee.class);
//    private static Map<String, String> asiaHashMap, asiaHashMapTwo, diffHashMap;
//    private static Map<String, String[]> asiaArrayHashMap, asiaArrayHashMapTwo, diffArrayHashMap;
//
//    @BeforeAll
//    public static void Initialise() {
//        asiaHashMap = new HashMap<String, String>();
//        asiaHashMapTwo = new HashMap<String, String>();
//        diffHashMap = new HashMap<String, String>();
//        asiaArrayHashMapTwo = new HashMap<String, String[]>();
//        asiaArrayHashMap = new HashMap<String, String[]>();
//        diffArrayHashMap = new HashMap<String, String[]>();
//    }
//
//    @BeforeEach
//    public void Setup() {
//        asiaHashMap.put("South Korea", "Seoul");
//        asiaHashMap.put("Japan", "Tokyo");
//        asiaHashMapTwo.put("Japan", "Tokyo");
//        asiaHashMapTwo.put("South Korea", "Seoul");
//        diffHashMap.put("Japan", "Tokyo");
//        diffHashMap.put("South Korea", null);
//        asiaArrayHashMap.put("South Korea", new String[] {"Seoul", "Busan"});
//        asiaArrayHashMap.put("Japan", new String[] {"Tokyo", "Osaka"});
//        asiaArrayHashMapTwo.put("Japan", new String[] {"Tokyo", "Osaka"});
//        asiaArrayHashMapTwo.put("South Korea", new String[] {"Seoul", "Busan"});
//        diffArrayHashMap.put("Japan", new String[] {"Tokyo", "Osaka"});
//        diffArrayHashMap.put("South Korea", new String[] {});
//    }
//
//    @AfterEach
//    public void Breakdown() {
//        asiaHashMap.clear();
//        asiaHashMapTwo.clear();
//        diffHashMap.clear();
//        asiaArrayHashMap.clear();
//        asiaArrayHashMapTwo.clear();
//        diffArrayHashMap.clear();
//    }
//
//    @Test
//    public void TestHashMap_Equal_ShouldPass() {
//        // TODO: compare asiaHashMap to asiaHashMapTwo (different insert order)
//        assertTrue( );
//    }
//
//    @Test
//    public void TestHashMap_NotEqual_ShouldFail() {
//        // TODO: compare asiaHashMap to diffHashMap (different values)
//        assertFalse( );
//    }
//
//    //NOTE:
//    // entryset(): return set view of <key, value> pairs
//    // keyset(): return set view of all keys
//    @Test
//    public void TestHashMap_EqualKeys_ShouldPass() {
//        // TODO: compare asiaHashMap keys to diffHashMap keys
//        assertTrue( );
//    }
//
//    @Test // NOTE: // values(): return collection view of all values
//    public void TestHashMap_EqualValues_ShouldPass() {
//        // TODO: compare asiaHashMap values to diffHashMap values
//        //  * hint: use containsAll() *
//        assertTrue( );
//    }
//
//    @Test
//    public void TestHashMapArray_NotEqual_ShouldFail() {
//        // NOTE: compares reference of String[]
//        // TODO: use equals() to compare asiaArrayHashMap to asiaArrayHashMapTwo
//        assertFalse( );
//    }
//
//    @Test
//    public void TestHashMapArray_Equal_ShouldPass() {
//        // TODO: compare asiaArrayHashMap string to asiaArrayHashMapTwo string
//        //  * use printHashMap() *
//        assertEquals( );
//        // TODO: complete method equalHashMap()
//        assertTrue(equalHashMap(asiaArrayHashMap, asiaArrayHashMapTwo));
//    }
//
//    public String printHashMap(Map<String, String[]> hashmap) {
//        StringBuilder sb = new StringBuilder();
//        for(String country: hashmap.keySet()) {
//            sb.append(country + "={");
//            sb.append(Arrays.toString(hashmap.get(country)));
//            sb.append("} ");
//        }
//        return sb.toString();
//    }
//
//    // NOTE: compares maps by keys AND values
//    public boolean equalHashMap(Map<String, String[]> hm1, Map<String, String[]> hm2) {
//        // TODO: compare sizes first
//        if( ) return false;
//
//        // TODO: use entrySet() and stream().allMatch()
//        // TODO: predicate compares values
//        return hm1.entrySet().stream()
//                .allMatch(p -> Arrays.equals(p.____, hm2.get(p.____)));
//    }
//}
