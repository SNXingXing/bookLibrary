package com.bookLibrary.bean;

import java.util.Date;

public class Isbn {
    private Integer isbnId;

    private String isbn;

    private Integer nId;

    private Integer pId;

    private Integer aId;

    private Integer cId;

    private Date publishtime;

    private String edition;

    private Integer num;

    public Integer getIsbnId() {
        return isbnId;
    }

    public void setIsbnId(Integer isbnId) {
        this.isbnId = isbnId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition == null ? null : edition.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}