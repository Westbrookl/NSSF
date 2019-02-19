package com.NSSFDataModel;

public enum AccessType {
    GPP_ACCESS("3GPP_ACCESS"),
    NON_3GPP_ACCESS("NON_3GPP_ACCESS");
    private String typeName;
    AccessType(String typeName){
        this.typeName = typeName;
    }
    public static AccessType fromTypeName(String typeName){
        for(AccessType accessType: AccessType.values()){
            if(accessType.getTypeName().equals(typeName)){
                return  accessType;
            }

        }
        return null;
    }
    public String  getTypeName(){
        return this.typeName;
    }
}
