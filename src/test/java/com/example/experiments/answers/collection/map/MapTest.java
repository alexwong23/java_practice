package com.example.experiments.answers.collection.map;

import com.example.experiments.model.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {

    public static Logger log = LoggerFactory.getLogger(Employee.class);
    private static Map<String, String> asiaHashMap, asiaLinkedHashMap, asiaTreeMap;

    @BeforeAll
    public static void Initialise() {
        asiaHashMap = new HashMap<>();
        asiaLinkedHashMap = new LinkedHashMap<>();
        asiaTreeMap = new TreeMap<>();
    }

    @BeforeEach
    public void Setup() {
        asiaHashMap.put("South Korea", "Seoul");
        asiaHashMap.put("Japan", "Tokyo");
        asiaHashMap.put("Singapore", null);
        asiaLinkedHashMap.put("South Korea", "Seoul");
        asiaLinkedHashMap.put("Japan", "Tokyo");
        asiaLinkedHashMap.put("Singapore", null);
        asiaTreeMap.put("South Korea", "Seoul");
        asiaTreeMap.put("Japan", "Tokyo");
        asiaTreeMap.put("Singapore", null);
    }

    @AfterEach
    public void Breakdown() {
        asiaHashMap.clear();
        asiaLinkedHashMap.clear();
        asiaTreeMap.clear();
    }

    @Test
    public void TestMaps_InsertionOrder() {
        assertNotEquals(asiaHashMap.keySet().toString(), "[South Korea, Japan, Singapore]");    // NOTE: NO insertion order
        assertEquals(asiaLinkedHashMap.keySet().toString(), "[South Korea, Japan, Singapore]"); // NOTE: has insertion order
        assertEquals(asiaTreeMap.keySet().toString(), "[Japan, Singapore, South Korea]");       // NOTE: elements sorted
    }

    @Test
    public void TestHashMap_Null_ShouldPass() {
        asiaHashMap.put(null, null);
        assertTrue(asiaHashMap.containsKey(null));
        assertEquals(asiaHashMap.size(), 4);
    }

    @Test
    public void TestLinkedHashMap_Null_ShouldPass() {
        asiaLinkedHashMap.put(null, null);
        assertTrue(asiaLinkedHashMap.containsKey(null));
        assertEquals(asiaLinkedHashMap.keySet().toString(), "[South Korea, Japan, Singapore, null]");
    }

    @Test
    public void TestTreeMap_NoNull_ShouldFail() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            asiaTreeMap.put(null, null);
        });
        assertEquals(exception.getMessage(), null);
        assertEquals(asiaTreeMap.size(), 3);
    }

    public String printMap(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for(String country: map.keySet()) {
            sb.append(country + ":");
            sb.append(map.get(country));
            sb.append(", ");
        }
        return sb.toString();
    }
}
