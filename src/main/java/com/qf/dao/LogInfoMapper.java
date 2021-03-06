package com.qf.dao;

import com.qf.bean.PageBean;
import com.qf.domain.LogInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LogInfoMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(LogInfo record);

    int insertSelective(LogInfo record);

    LogInfo selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(LogInfo record);

    int updateByPrimaryKey(LogInfo record);

    List<LogInfo> findLogInfo(PageBean pageBean);

    Long getLogInfoCount(PageBean pageBean);
}