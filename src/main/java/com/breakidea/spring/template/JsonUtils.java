package com.breakidea.spring.template;

import com.google.gson.Gson;

public class JsonUtils {
    public static String toJsonString(Object data) {
        Gson s = new Gson();
        return s.toJson(s);
    }
}
