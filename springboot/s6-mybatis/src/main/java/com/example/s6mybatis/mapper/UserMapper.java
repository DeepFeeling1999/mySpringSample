package com.example.s6mybatis.mapper;

import com.example.s6mybatis.pojo.Good;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *表示Mapper类的接口
 */
@Mapper
@Repository
public interface UserMapper {

    List<Good> queryGoodsList();

    void addGood(Good good);
    int updateGood(Good good);
    int deleteGood(int id);
}
