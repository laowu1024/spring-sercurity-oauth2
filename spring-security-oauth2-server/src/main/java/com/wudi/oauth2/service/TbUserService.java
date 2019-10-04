package com.wudi.oauth2.service;

import com.wudi.oauth2.domain.TbUser;

public interface TbUserService{
    TbUser getByUsername(String username);
}
