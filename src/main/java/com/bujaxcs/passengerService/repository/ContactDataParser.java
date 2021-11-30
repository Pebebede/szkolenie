package com.bujaxcs.passengerService.repository;

import org.json.JSONObject;

public class ContactDataParser {


    public String getEmail(String contactData) {
        String jsonString = contactData;
        String email = "";
        JSONObject obj = new JSONObject(jsonString);
        if (jsonString.contains("email")) {
            email = obj.getString("email");
        } else {
            email = "No contact email";
        }
        return email;
    }

    public String getPhone(String contactData) {
        String jsonString = contactData;
        String phone = "";
        JSONObject obj = new JSONObject(jsonString);
        if (jsonString.contains("phone")) {
            phone = obj.getString("phone");
        } else {
            phone = "No contact phone number";
        }
        return phone;
    }

//    private String extractPhone(String quote) {
//        String phone = "";
//        String regex = "\\++.\\d{6,}";
//        String string = quote;
//
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(string);
//
//        while (matcher.find()) {
//            phone = matcher.group(0);
//        }
//        return phone;
//    }
//
//    private String extractEmail(String quote) {
//        String email = "";
//        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9.]+";
//        String string = quote;
//
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(string);
//
//        while (matcher.find()) {
//            email = matcher.group(0);
//
//        }
//        return email;
//    }
}

