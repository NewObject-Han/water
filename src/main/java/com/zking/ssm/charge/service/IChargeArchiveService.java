package com.zking.ssm.charge.service;

import com.zking.ssm.charge.model.Archive;

/**
 * @author liang
 * @create 2020-12-17-15:58
 */
public interface IChargeArchiveService {
    int deleteByPrimaryKey(Integer id);

    int insert(Archive record);

    int insertSelective(Archive record);

    Archive selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Archive record);

    int updateByPrimaryKey(Archive record);
}
