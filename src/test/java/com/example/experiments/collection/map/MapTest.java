package com.example.experiments.collection.map;

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
        // TODO: initialise hashmap, linkedhashmap and treemap
        asiaHashMap =
        asiaLinkedHashMap =
        asiaTreeMap =
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
        // TODO: complete the assert method - assertEquals or assertNotEquals?
        //  * consider their insertion order *
        assert_____(asiaHashMap.keySet().toString(), "[South Korea, Japan, Singapore]");
        assert_____(asiaLinkedHashMap.keySet().toString(), "[South Korea, Japan, Singapore]");
        assert_____(asiaTreeMap.keySet().toString(), "[Japan, Singapore, South Korea]");
    }

    @Test
    public void TestHashMap_Null_ShouldPass() {
        // TODO: add null to asiaHashMap

        assertTrue(asiaHashMap.containsKey(null));
        assertEquals(asiaHashMap.size(), 4);
    }

    @Test
    public void TestLinkedHashMap_Null_ShouldPass() {
        // TODO: add null to asiaLinkedHashMap

        assertTrue(asiaLinkedHashMap.containsKey(null));
        assertEquals(asiaLinkedHashMap.keySet().toString(), "[South Korea, Japan, Singapore, null]");
    }

    @Test
    public void TestTreeMap_NoNull_ShouldFail() {
        // TODO: asiaTreeMap add null throws NullPointerException
        Exception exception =
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
