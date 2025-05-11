package com.preonboarding.challenge.test.mapper;

import org.apache.ibatis.annotations.Mapper;
// dao
@Mapper
public interface TestMapper {
    int testSelectOne();
}
