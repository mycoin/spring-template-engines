package com.breakidea.spring.template;

import com.google.gson.Gson;

public class JsonUtils {
    private static Gson s = new Gson();

    public static String toJson(Object data) {
        return s.toJson(s);
    }
}
