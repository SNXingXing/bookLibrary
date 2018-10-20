package com.bookLibrary.bean;

public class BookName {
    private Integer nId;

    private String bName;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

}