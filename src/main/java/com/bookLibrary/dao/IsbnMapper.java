package com.bookLibrary.dao;

import com.bookLibrary.bean.Isbn;
import com.bookLibrary.bean.IsbnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsbnMapper {
    long countByExample(IsbnExample example);

    int deleteByExample(IsbnExample example);

    int deleteByPrimaryKey(Integer isbnId);

    int insert(Isbn record);

    int insertSelective(Isbn record);

    List<Isbn> selectByExample(IsbnExample example);

    Isbn selectByPrimaryKey(Integer isbnId);

    int updateByExampleSelective(@Param("record") Isbn record, @Param("example") IsbnExample example);

    int updateByExample(@Param("record") Isbn record, @Param("example") IsbnExample example);

    int updateByPrimaryKeySelective(Isbn record);

    int updateByPrimaryKey(Isbn record);
}