package com.bookLibrary.dao;

import com.bookLibrary.bean.Author;
import com.bookLibrary.bean.AuthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorMapper {
    long countByExample(AuthorExample example);

    int deleteByExample(AuthorExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(Author record);

    int insertSelective(Author record);

    List<Author> selectByExample(AuthorExample example);

    Author selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") Author record, @Param("example") AuthorExample example);

    int updateByExample(@Param("record") Author record, @Param("example") AuthorExample example);

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);
}