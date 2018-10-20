package com.bookLibrary.bean;

public class Store {
    private Integer sId;

    private Integer isbnId;

    private Integer pbId;

    private Integer sState;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getIsbnId() {
        return isbnId;
    }

    public void setIsbnId(Integer isbnId) {
        this.isbnId = isbnId;
    }

    public Integer getPbId() {
        return pbId;
    }

    public void setPbId(Integer pbId) {
        this.pbId = pbId;
    }

    public Integer getsState() {
        return sState;
    }

    public void setsState(Integer sState) {
        this.sState = sState;
    }
}