package com.NSSFDataModel;

import java.util.List;

/**
 * @author jhc on 2018/10/13
 */
public class AllowedSnssai {
    private Snssai allowedSnssai;
    private List<NsiInformation> nsiInformation;
    private Snssai mappedHomeSnssai;

    public Snssai getAllowedSnssai() {
        return allowedSnssai;
    }

    public void setAllowedSnssai(Snssai allowedSnssai) {
        this.allowedSnssai = allowedSnssai;
    }

    public List<NsiInformation> getNsiInformation() {
        return nsiInformation;
    }

    public void setNsiInformation(List<NsiInformation> nsiInformation) {
        this.nsiInformation = nsiInformation;
    }

    public Snssai getMappedHomeSnssai() {
        return mappedHomeSnssai;
    }

    public void setMappedHomeSnssai(Snssai mappedHomeSnssai) {
        this.mappedHomeSnssai = mappedHomeSnssai;
    }
}
