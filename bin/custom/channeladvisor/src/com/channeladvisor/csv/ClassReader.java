package com.channeladvisor.csv;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClassReader
{
    public static String[] getHeaders(Object o)
    {
        List<String> headers = new ArrayList<String>();
        for(Field field : o.getClass().getDeclaredFields())
        {
            CsvHeader header = field.getDeclaredAnnotation(CsvHeader.class);
            if(header != null)
            {
                headers.add(header.headerName());
            }
        }

        String[] arr = new String[headers.size()];
        for (String header : headers) {
            arr[headers.indexOf(header)] = header;
        }
        return arr;
    }

    public static HashMap<String, String> readValues(Object o) throws IllegalAccessException
    {
        HashMap<String, String> fieldToValues = new HashMap<>();

        for(Field field : o.getClass().getDeclaredFields())
        {
            CsvHeader header = field.getDeclaredAnnotation(CsvHeader.class);
            if(header != null)
            {
                String headerName = header.headerName();
                field.setAccessible(true);
                if(field.get(o) != null)
                {
                    fieldToValues.put(headerName, (String) field.get(o));
                }
                else
                {
                    fieldToValues.put(headerName, "");
                }
            }
        }

        return fieldToValues;
    }
}
