package com.NSSFDataModel;

/**
 * @author jhc on 2018/10/13
 */
public class SubscribedSnssai {
    private Snssai snssai;
    private Boolean defaultIndication;

    public Snssai getSnssai() {
        return snssai;
    }

    public void setSnssai(Snssai snssai) {
        this.snssai = snssai;
    }

    public Boolean getDefaultIndication() {
        return defaultIndication;
    }

    public void setDefaultIndication(Boolean defaultIndication) {
        this.defaultIndication = defaultIndication;
    }
}
