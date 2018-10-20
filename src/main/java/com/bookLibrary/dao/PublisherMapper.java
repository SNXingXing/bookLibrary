package com.bookLibrary.dao;

import com.bookLibrary.bean.Publisher;
import com.bookLibrary.bean.PublisherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublisherMapper {
    long countByExample(PublisherExample example);

    int deleteByExample(PublisherExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(Publisher record);

    int insertSelective(Publisher record);

    List<Publisher> selectByExample(PublisherExample example);

    Publisher selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") Publisher record, @Param("example") PublisherExample example);

    int updateByExample(@Param("record") Publisher record, @Param("example") PublisherExample example);

    int updateByPrimaryKeySelective(Publisher record);

    int updateByPrimaryKey(Publisher record);
}