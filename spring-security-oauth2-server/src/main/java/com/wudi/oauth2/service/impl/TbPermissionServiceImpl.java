package com.wudi.oauth2.service.impl;

import com.wudi.oauth2.domain.TbPermission;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wudi.oauth2.mapper.TbPermissionMapper;
import com.wudi.oauth2.service.TbPermissionService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;


    @Override
    public List<TbPermission> selectByUserId(long id) {
        return tbPermissionMapper.selectByUserId(id);
    }
}
