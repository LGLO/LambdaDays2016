package com.github.LGLO.lambdadays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class JacksonWrapper {

    private static ObjectMapper m = new ObjectMapper();
    private static ObjectReader r = m.reader();

    public static JsonNode parse(String s) throws IllegalArgumentException{
        try {
            return r.readTree(s);
        }catch(JsonProcessingException e){
            throw new IllegalArgumentException(e.getMessage());
        }catch(Exception e){
            throw new IllegalArgumentException(e.toString());
        }
    }

}
