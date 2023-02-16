package com.codecafe.javabacktobasics.miscellaneous;

import org.json.JSONObject;

import java.util.List;

public class RemoveFieldFromJSONString {

  public static void main(String[] args) {
    String jsonStr = "{\"firstName\": \"John\", \"lastName\": \"Doe\", \"address\": {\"city\": \"New York City\", \"state\": \"New York\"}}";

    System.out.println("JSON before :\n" + jsonStr);

    removeField(jsonStr, List.of("address"), "state");

    removeField(jsonStr, null, "lastName");
  }

  private static void removeField(String jsonStr, List<String> nodes, String fieldToRemove) {
    JSONObject jsonObj = new JSONObject(jsonStr);

    JSONObject jsonObj1 = jsonObj;

    if (nodes != null && !nodes.isEmpty()) {
      for (String node : nodes) {
        jsonObj1 = jsonObj.getJSONObject(node);
      }
    }

    jsonObj1.remove(fieldToRemove);

    System.out.println("JSON after :\n" + jsonObj);
  }

}
