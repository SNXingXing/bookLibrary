package com.bookLibrary.dao;

import com.bookLibrary.bean.Store;
import com.bookLibrary.bean.StoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreMapper {
    long countByExample(StoreExample example);

    int deleteByExample(StoreExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(Store record);

    int insertSelective(Store record);

    List<Store> selectByExample(StoreExample example);

    Store selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}