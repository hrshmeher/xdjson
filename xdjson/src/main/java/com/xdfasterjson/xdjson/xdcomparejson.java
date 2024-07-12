package com.xdfasterjson.xdjson;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flipkart.zjsonpatch.JsonDiff;

import java.io.IOException;

public class xdcomparejson {

    public static void main(String[] args) throws IOException {
        String beforeJson = "{\"name\": \"Alice\", \"age\": 30}";
        String afterJson = "{\"name\": \"Bob\", \"age\": 30, \"city\": \"New York\"}";

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode beforeNode = objectMapper.readTree(beforeJson);
        JsonNode afterNode = objectMapper.readTree(afterJson);

        JsonNode patch = JsonDiff.asJson(beforeNode, afterNode);
        System.out.println(patch.toPrettyString());
    }
}