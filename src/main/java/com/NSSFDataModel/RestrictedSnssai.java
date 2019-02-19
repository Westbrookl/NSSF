package com.NSSFDataModel;

import java.util.List;

/**
 * @author jhc on 2018/10/15
 */
public class RestrictedSnssai {
    private PlmnId homePlmnId;
    private List<Snssai> sNssai;

    public PlmnId getHomePlmnId() {
        return homePlmnId;
    }

    public void setHomePlmnId(PlmnId homePlmnId) {
        this.homePlmnId = homePlmnId;
    }

    public List<Snssai> getsNssai() {
        return sNssai;
    }

    public void setsNssai(List<Snssai> sNssai) {
        this.sNssai = sNssai;
    }
}
