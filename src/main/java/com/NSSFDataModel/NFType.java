package com.NSSFDataModel;

public enum NFType {
    NRF("NRF"),
    UDM("UDM"),
    AMF("AMF"),
    SMF("SMF"),
    AUSF("AUSF"),
    NEF("NEF"),
    PCF("PCF"),
    SMSF("SMSF"),
    NSSF("NSSF"),
    UDR("UDR"),
    LMF("LMF"),
    GMLC("GMLC"),
    G_EIR("5G_EIR"),
    SEPP("SEPP"),
    UPF("UPF"),
    N3IWF("N3IWF"),
    AF("AF"),
    UDSF("UDSF"),
    BSF("BSF"),
    CHF("CHF"),
    NWDAF("NWDAF");
    private String typeName;
    NFType(String typeName){
        this.typeName = typeName;
    }

    public NFType fromTypeName(String typeName){
        for(NFType nfType: NFType.values()){
            if(nfType.getTypeName().equals(typeName)){
                return nfType;
            }
        }
        return null;
    }

    public String getTypeName(){
        return this.typeName;
    }
}
