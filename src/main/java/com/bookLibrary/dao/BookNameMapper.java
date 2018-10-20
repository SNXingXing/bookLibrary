package com.bookLibrary.dao;

import com.bookLibrary.bean.BookName;
import com.bookLibrary.bean.BookNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookNameMapper {
    long countByExample(BookNameExample example);

    int deleteByExample(BookNameExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(BookName record);

    int insertSelective(BookName record);

    List<BookName> selectByExample(BookNameExample example);

    BookName selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") BookName record, @Param("example") BookNameExample example);

    int updateByExample(@Param("record") BookName record, @Param("example") BookNameExample example);

    int updateByPrimaryKeySelective(BookName record);

    int updateByPrimaryKey(BookName record);
}