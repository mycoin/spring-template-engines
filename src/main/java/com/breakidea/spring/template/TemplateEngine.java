package com.breakidea.spring.template;

import java.util.Map;

public interface TemplateEngine {
    public String render(String templateLocation, Map<String, Object> model);
}
