package com.mk.test.flattenarray;

import java.util.ArrayList;
import java.util.List;

public class FlattenClass {

    private void flattenTheArray(Object[] objects, List<Object> flattenedArray) {
        if (objects != null) {
            for (Object object : objects) {
                if (object != null) {
                    if (object.getClass().isArray()) {
                        flattenTheArray((Object[]) object, flattenedArray);
                    } else {
                        flattenedArray.add(object);
                    }
                }
            }
        }
    }

    public Object[] flatten(Object[] objects) {
        List<Object> finalList = new ArrayList<>();
        flattenTheArray(objects, finalList);
        if (!finalList.isEmpty()) {
            return finalList.toArray();
        } else {
            return null;
        }
    }

    public String printObjectArray(Object[] objects) {
        StringBuilder str = new StringBuilder();
        if (objects != null) {
            for (Object object : objects) {
                str.append(object.toString() + " ");
            }
        }
        return str.toString();
    }
}
