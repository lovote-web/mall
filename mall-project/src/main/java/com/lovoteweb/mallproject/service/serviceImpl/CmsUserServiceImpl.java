package com.lovoteweb.mallproject.service.serviceImpl;

import com.lovoteweb.mallproject.mbg.model.UmsPermission;
import com.lovoteweb.mallproject.mbg.model.UmsUser;

import java.util.List;

public interface CmsUserServiceImpl {
    UmsUser register(UmsUser cmsUser);

    String login(String username,String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);
}
