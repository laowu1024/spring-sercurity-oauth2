package com.wudi.oauth2.service;

import com.wudi.oauth2.domain.TbPermission;

import java.util.List;

public interface TbPermissionService {

    List<TbPermission> selectByUserId(long id);



}
