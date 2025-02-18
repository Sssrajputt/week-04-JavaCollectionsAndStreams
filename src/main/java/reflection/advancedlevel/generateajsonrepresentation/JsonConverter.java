package reflection.advancedlevel.generateajsonrepresentation;

import java.lang.reflect.Field;

public class JsonConverter {

    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            try {
                fields[i].setAccessible(true);
                json.append("\"").append(fields[i].getName()).append("\": \"")
                        .append(fields[i].get(obj)).append("\"");

                if (i < fields.length - 1) {
                    json.append(", ");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        json.append("}");
        return json.toString();
    }
}
