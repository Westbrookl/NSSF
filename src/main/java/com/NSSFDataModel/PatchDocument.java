package com.NSSFDataModel;

import java.util.List;

/**
 * @author jhc on 2018/10/15
 */
public class PatchDocument {
    private List<PatchItem> patchItemList;

    public List<PatchItem> getPatchItemList() {
        return patchItemList;
    }

    public void setPatchItemList(List<PatchItem> patchItemList) {
        this.patchItemList = patchItemList;
    }
}
