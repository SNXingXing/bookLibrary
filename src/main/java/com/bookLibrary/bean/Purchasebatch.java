package com.bookLibrary.bean;

import java.util.Date;

public class Purchasebatch {
    private Integer pbId;

    private Date pbTime;

    private String pbNotes;

    public Integer getPbId() {
        return pbId;
    }

    public void setPbId(Integer pbId) {
        this.pbId = pbId;
    }

    public Date getPbTime() {
        return pbTime;
    }

    public void setPbTime(Date pbTime) {
        this.pbTime = pbTime;
    }

    public String getPbNotes() {
        return pbNotes;
    }

    public void setPbNotes(String pbNotes) {
        this.pbNotes = pbNotes == null ? null : pbNotes.trim();
    }
}