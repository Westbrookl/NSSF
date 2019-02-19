package com.NSSFDataModel;

/**
 * @author jhc on 2018/10/13
 */
public class MappingOfRequestedSnssai {
    private Snssai servingSnssai;
    private Snssai homeSnssai;

    public Snssai getServingSnssai() {
        return servingSnssai;
    }

    public void setServingSnssai(Snssai servingSnssai) {
        this.servingSnssai = servingSnssai;
    }

    public Snssai getHomeSnssai() {
        return homeSnssai;
    }

    public void setHomeSnssai(Snssai homeSnssai) {
        this.homeSnssai = homeSnssai;
    }
}
