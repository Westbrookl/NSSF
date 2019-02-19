package com.NSSFDataModel;

/**
 * @author jhc on 2018/10/13
 */
public class SliceInfoForPDUSession {
    private Snssai sNssai;
    private RoamingIndication roamingIndication;
    private Snssai homeSnssai;

    public Snssai getsNssai() {
        return sNssai;
    }

    public void setsNssai(Snssai sNssai) {
        this.sNssai = sNssai;
    }

    public RoamingIndication getRoamingIndication() {
        return roamingIndication;
    }

    public void setRoamingIndication(RoamingIndication roamingIndication) {
        this.roamingIndication = roamingIndication;
    }

    public Snssai getHomeSnssai() {
        return homeSnssai;
    }

    public void setHomeSnssai(Snssai homeSnssai) {
        this.homeSnssai = homeSnssai;
    }
}
