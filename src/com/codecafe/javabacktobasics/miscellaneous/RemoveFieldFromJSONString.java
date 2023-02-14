package com.codecafe.javabacktobasics.miscellaneous;

import org.json.JSONObject;

public class RemoveFieldFromJSONString {

  public static void main(String[] args) {
    String jsonStr = "{\"firstName\": \"John\", \"lastName\": \"Doe\", \"address\": {\"city\": \"New York City\", \"state\": \"New York\"}}";

    System.out.println("JSON before :\n" + jsonStr);

    JSONObject jsonObj = new JSONObject(jsonStr);
    jsonObj.remove("lastName");
    jsonObj.getJSONObject("address").remove("state");

    System.out.println("JSON after :\n" + jsonObj);
  }

}
