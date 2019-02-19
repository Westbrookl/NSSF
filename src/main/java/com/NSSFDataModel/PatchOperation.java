package com.NSSFDataModel;

public enum PatchOperation {
    ADD("add"),
    COPY("copy"),
    MOVE("move"),
    REMOVE("remove"),
    REPLACE("replace"),
    TEST("test");

    private String typeName;
    PatchOperation(String typeName){
        this.typeName =typeName;
    }

    public static PatchOperation fromTypeName(String typeName){
        for(PatchOperation patchOperation: PatchOperation.values()){
            if(patchOperation.getTypeName().equals(typeName)){
                return patchOperation;
            }
        }
        return null;
    }

    public String getTypeName(){
        return this.typeName;
    }
}
