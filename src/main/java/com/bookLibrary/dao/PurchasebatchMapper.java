package com.bookLibrary.dao;

import com.bookLibrary.bean.Purchasebatch;
import com.bookLibrary.bean.PurchasebatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchasebatchMapper {
    long countByExample(PurchasebatchExample example);

    int deleteByExample(PurchasebatchExample example);

    int deleteByPrimaryKey(Integer pbId);

    int insert(Purchasebatch record);

    int insertSelective(Purchasebatch record);

    List<Purchasebatch> selectByExample(PurchasebatchExample example);

    Purchasebatch selectByPrimaryKey(Integer pbId);

    int updateByExampleSelective(@Param("record") Purchasebatch record, @Param("example") PurchasebatchExample example);

    int updateByExample(@Param("record") Purchasebatch record, @Param("example") PurchasebatchExample example);

    int updateByPrimaryKeySelective(Purchasebatch record);

    int updateByPrimaryKey(Purchasebatch record);
}