package com.mabf.dao;

import com.mabf.entity.Bcmp_sm_agent;

public interface Bcmp_sm_agentMapper {
    int deleteByPrimaryKey(String agentId);

    int insert(Bcmp_sm_agent record);

    int insertSelective(Bcmp_sm_agent record);

    Bcmp_sm_agent selectByPrimaryKey(String agentId);

    int updateByPrimaryKeySelective(Bcmp_sm_agent record);

    int updateByPrimaryKey(Bcmp_sm_agent record);
}