package com.lovoteweb.mallproject.dto;

import com.lovoteweb.mallproject.mbg.mapper.UmsUserMapper;
import com.lovoteweb.mallproject.mbg.mapper.UmsUserpermissionrelationMapper;
import com.lovoteweb.mallproject.mbg.model.*;
import com.lovoteweb.mallproject.service.CmsUserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/**
 * 加载特定于用户的数据的核心接口。
 * 它作为用户DAO在整个框架中使用，是DaoAuthenticationProvider使用的策略。
 * 该接口只需要一个只读方法，这简化了对新数据访问策略的支持。
 *
 * @author maxzhao
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {
    /**
     * 用户操作服务
     */
    @Autowired
    private UmsUserMapper umsUserMapper;

    @Autowired
    private CmsUserService cmsUserService;

    @Override
    public UserDetails loadUserByUsername(String loginName) {

        UserDetails userDetails = null;
        List<UmsPermission> permissionList = null;

        UmsUserExample example = new UmsUserExample();
        example.createCriteria().andUsernameEqualTo(loginName);

        List<UmsUser> umsUser = umsUserMapper.selectByExample(example);


        if(umsUser.size() > 0){
            permissionList = cmsUserService.getPermissionList(umsUser.get(0).getId());
            userDetails = new AdminUserDetails(umsUser.get(0),permissionList);
        }

        return userDetails;
    }

}
