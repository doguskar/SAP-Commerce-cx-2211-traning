package com.channeladvisor.csv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvBuilder
{
    public String buildCsv(List<? extends Object> objects) throws IllegalAccessException
    {
        HashMap<String, Integer> columnToIndex = new HashMap<>();
        Object o = objects.get(0);
        String[] headers = ClassReader.getHeaders(o);

        for (int i = 0; i < headers.length; i++)
        {
            columnToIndex.put(headers[i], i);
        }

        List<Row> rows = new ArrayList<>();
        for (Object object : objects)
        {
            HashMap<String, String> columnToValue = ClassReader.readValues(object);
            Row row = new Row(columnToIndex);

            for (String s : columnToValue.keySet()) {
                String header = s;
                String value = columnToValue.get(header);

                row.addCellToHeader(header, value);
            }

            rows.add(row);
        }

        StringBuilder stringRows = new StringBuilder();
        stringRows.append(buildHeaders(columnToIndex)).append("\n");

        for (Row row : rows) {
            stringRows.append(row.toString()).append("\n");
        }

        return stringRows.toString();
    }
    public String getHeaders(List<? extends Object> objects)
    {
        HashMap<String, Integer> columnToIndex = new HashMap<>();
        Object o = objects.get(0);
        String[] headers = ClassReader.getHeaders(o);

        for (int i = 0; i < headers.length; i++)
        {
            columnToIndex.put(headers[i], i);
        }

        StringBuilder stringRows = new StringBuilder();
        stringRows.append(buildHeaders(columnToIndex));

        return stringRows.toString();
    }
    public String buildCsvWithoutHeader(List<? extends Object> objects) throws IllegalAccessException
    {
        HashMap<String, Integer> columnToIndex = new HashMap<>();
        Object o = objects.get(0);
        String[] headers = ClassReader.getHeaders(o);

        for (int i = 0; i < headers.length; i++)
        {
            columnToIndex.put(headers[i], i);
        }

        List<Row> rows = new ArrayList<>();
        for (Object object : objects)
        {
            HashMap<String, String> columnToValue = ClassReader.readValues(object);
            Row row = new Row(columnToIndex);

            for (String s : columnToValue.keySet()) {
                String header = s;
                String value = columnToValue.get(header);

                row.addCellToHeader(header, value);
            }

            rows.add(row);
        }

        StringBuilder stringRows = new StringBuilder();

        for (Row row : rows) {
            stringRows.append(row.toString().replace("\n", "")).append("\n");
        }

        return stringRows.toString();
    }

    public String buildHeaders(Map<String, Integer> columnToIndex)
    {
        String[] headers = new String[columnToIndex.size()];

        for (Map.Entry<String,Integer> entry : columnToIndex.entrySet()){
            int index = columnToIndex.get(entry.getKey());
            headers[index] = entry.getKey();
        }

        StringBuilder headerBuilder = new StringBuilder();
        for (int i = 0; i < headers.length; i++) {
            headerBuilder.append(headers[i]).append(";");
        }

        return headerBuilder.toString();
    }

    public static CsvBuilder newInstance()
    {
        return new CsvBuilder();
    }

}
