package com.NSSFDataModel;

/**
 * @author jhc on 2018/10/13
 */
public class ConfiguredSnssai {
    private Snssai configuredSnssa;
    private Snssai mappedHomeSnssai;

    public Snssai getConfiguredSnssa() {
        return configuredSnssa;
    }

    public void setConfiguredSnssa(Snssai configuredSnssa) {
        this.configuredSnssa = configuredSnssa;
    }

    public Snssai getMappedHomeSnssai() {
        return mappedHomeSnssai;
    }

    public void setMappedHomeSnssai(Snssai mappedHomeSnssai) {
        this.mappedHomeSnssai = mappedHomeSnssai;
    }
}
