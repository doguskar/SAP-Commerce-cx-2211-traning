package com.channeladvisor.csv;

import java.util.HashMap;

public class Row
{
    private static final String DELIMITER = ";";
    private HashMap<String, Integer> columnToIndex = new HashMap<>();

    private Cell[] cells;

    public int getIndexByColumnName(String columnName)
    {
        return columnToIndex.get(columnName);
    }

    private void createCells (int size)
    {
        cells = new Cell[size];
    }

    public void addCellToHeader(String header, String value)
    {
        int index = getIndexByColumnName(header);

        cells[index] = new Cell(value);
    }

    public Row(HashMap<String, Integer> columnToIndex)
    {
        createCells(columnToIndex.size());
        this.columnToIndex = columnToIndex;
    }

    public String toString()
    {
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < cells.length; i++) {
            row.append(cells[i].getValue()).append(DELIMITER);
        }

        return removeLastChar(row.toString());
    }

    private String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }
}
