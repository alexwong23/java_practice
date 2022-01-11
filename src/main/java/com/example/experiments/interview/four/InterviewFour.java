package com.example.experiments.interview.four;

import org.springframework.dao.DuplicateKeyException;
import java.util.LinkedList;

//    TODO:
//     Question 1: Design your own hashmap with GET and PUT operations
//      how to store data
//          - what data to store: key-value pairs
//          - which data structure: linkedList cause
//                                      get operation O(1)
//                                      put operation O(1)

public class InterviewFour {

    private LinkedList<KeyValuePair> ownHashMap;

    public InterviewFour() {
        ownHashMap = new LinkedList<>();
    }

    public String get(String key) throws NullPointerException {
        for(int i = 0; i < ownHashMap.size(); i++) {
            if(ownHashMap.get(i).getKey().equals(key)) {
                return ownHashMap.get(i).getValue();
            }
        }
        throw new NullPointerException("Cannot find key " + key);
    }

    public void put(String key, String value) throws DuplicateKeyException {
        // NOTE: check that there are no duplicate keys
        //  implement equals method in KeyValuePair
        if(!ownHashMap.contains(new KeyValuePair(key, value))) {
            ownHashMap.add(new KeyValuePair(key, value));
        } else {
            throw new DuplicateKeyException(key + " already exists in own Hash Map");
        }
    }

    @Override
    public String toString() {
        return "InterviewFour{" +
                "ownHashMap=" + ownHashMap.toString() +
                '}';
    }

    public LinkedList<KeyValuePair> getOwnHashMap() {
        return ownHashMap;
    }

    public void setOwnHashMap(LinkedList<KeyValuePair> ownHashMap) {
        this.ownHashMap = ownHashMap;
    }
}

