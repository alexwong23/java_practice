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
//    public void TestHashMap_Equals() {
//        // asiaHashMap      = <"South Korea", "Seoul">, <"Japan", "Tokyo">
//        // asiaHashMapTwo   = <"Japan", "Tokyo">, <"South Korea", "Seoul">
//        // diffHashMap      = <"Japan", "Tokyo">, <"South Korea", null>
//        // TODO: complete the assert method - assertTrue or assertFalse?
//        assert_____(asiaHashMap.equals(asiaHashMapTwo));
//        assert_____(asiaHashMap.equals(diffHashMap));
//    }
//
//    //NOTE:
//    // entryset(): return set view of <key, value> pairs
//    // keyset(): return set view of all keys
//    // values(): return collection view of all values
//    @Test
//    public void TestHashMap_EqualKeysAndValues_ShouldPass() {
//        // asiaHashMap      = <"South Korea", "Seoul">, <"Japan", "Tokyo">
//        // asiaHashMapTwo   = <"Japan", "Tokyo">, <"South Korea", "Seoul">
//        // diffHashMap      = <"Japan", "Tokyo">, <"South Korea", null>
//        // TODO: compare keys of asiaHashMap and diffHashMap
//        assertTrue( );
//        // TODO: compare values of asiaHashMap and asiaHashMapTwo * use containsAll *
//        assertTrue( );
//    }
//
//    @Test
//    public void TestHashMapArray_Equals() {
//        // asiaArrayHashMap      = <"South Korea", ["Seoul", "Busan"]>, <"Japan", ["Tokyo", "Osaka"]>
//        // asiaArrayHashMapTwo   = <"Japan", ["Tokyo", "Osaka"]>, <"South Korea", ["Seoul", "Busan"]>
//        // diffArrayHashMap      = <"Japan", ["Tokyo", "Osaka"]>, <"South Korea", []>
//        // TODO: complete the assert method - assertTrue or assertFalse?
//        assert_____(asiaArrayHashMap.equals(asiaArrayHashMapTwo));
//
//        // TODO: complete the helper method - equalHashMap()
//        assertTrue(equalHashMap(asiaArrayHashMap, asiaArrayHashMapTwo));   // NOTE: compares keys AND values using entryset()
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
//    // NOTE: helper method to compare maps
//    public boolean equalHashMap(Map<String, String[]> hm1, Map<String, String[]> hm2) {
//        // TODO: compare sizes
//        if( ) return false;
//
//        // TODO: fill in blanks with - getKey, getValue, entrySet, allMatch
//        return hm1._____().stream()
//                ._____(p -> Arrays.equals(p._____(), hm2.get(p._____())));
//    }
//}
