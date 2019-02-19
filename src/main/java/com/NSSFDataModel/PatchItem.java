package com.NSSFDataModel;

/**
 * @author jhc on 2018/10/13
 */
public class PatchItem {
    private PatchOperation op;
    private String path;
    private String from;
    private Object value;


    public PatchOperation getOp() {
        return op;
    }

    public void setOp(PatchOperation op) {
        this.op = op;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
