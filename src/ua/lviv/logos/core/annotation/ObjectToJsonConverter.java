package ua.lviv.logos.core.annotation;

import ua.lviv.logos.core.annotation.annotations.JsonElement;
import ua.lviv.logos.core.annotation.annotations.JsonSerializable;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ObjectToJsonConverter {

    public String convert(Object o)  {
        checkIfSerializable(o);
        Map<String, String> jsonMap = new HashMap<>();

        for (Field field : o.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonElement.class)) {
                try {
                    jsonMap.put(field.getName(), (String) field.get(o));
                } catch (IllegalAccessException e) {
                    System.err.print("error when serialization" + e.getMessage());
                }
            }
        }

        /*
        * {"firstName":"Jon", "lastName":"Snow"}
        * */
        String result= jsonMap.entrySet()
                .stream()
                .map(entry -> {
                   return  "\"" + entry.getKey() + "\":\""
                            + entry.getValue() + "\"";
                }).collect(Collectors.joining(","));
        return "{" +result + "}";
    }

    private void checkIfSerializable(Object o) {
        if (o == null) {
            throw new JsonSerializableException("Require not null value");
        }
        Class<?> clazz = o.getClass();
        if (!clazz.isAnnotationPresent(JsonSerializable.class)) {
            throw new JsonSerializableException("The class " + clazz.getSimpleName()
                    + " does not have JsonSerializable annotation");
        }
    }
}
