package com.channeladvisor.forms;

import java.util.Map;

public class CAOrderEntryReturnForm {
    private Map<Integer, Integer> returnEntryQuantityMap;
    private Map<Integer, String> returnEntryReasonMap;
    private Map<Integer, String> returnCAIdMap;

    public Map<Integer, Integer> getReturnEntryQuantityMap() {
        return returnEntryQuantityMap;
    }

    public void setReturnEntryQuantityMap(Map<Integer, Integer> returnEntryQuantityMap) {
        this.returnEntryQuantityMap = returnEntryQuantityMap;
    }

    public Map<Integer, String> getReturnEntryReasonMap() {
        return returnEntryReasonMap;
    }

    public void setReturnEntryReasonMap(Map<Integer, String> returnEntryReasonMap) {
        this.returnEntryReasonMap = returnEntryReasonMap;
    }

    public Map<Integer, String> getReturnCAIdMap() {
        return returnCAIdMap;
    }

    public void setReturnCAIdMap(Map<Integer, String> returnCAIdMap) {
        this.returnCAIdMap = returnCAIdMap;
    }
}
