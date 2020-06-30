package com.lovoteweb.mallproject.dto;

import com.lovoteweb.mallproject.mbg.model.UmsPermission;
import com.lovoteweb.mallproject.mbg.model.UmsUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SpringSecurity需要的用户详情
 * Created by macro on 2018/4/26.
 */
public class AdminUserDetails implements UserDetails {
    private UmsUser cmsUser;
    private List<UmsPermission> permissionList;
    public AdminUserDetails(UmsUser cmsUser, List<UmsPermission> permissionList) {
        this.cmsUser = cmsUser;
        this.permissionList = permissionList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        if(permissionList == null){
            return null;
        }
        return permissionList.stream()
                .filter(permission -> permission.getValue()!=null)
                .map(permission ->new SimpleGrantedAuthority(permission.getValue()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return cmsUser.getPassword();
    }

    @Override
    public String getUsername() {
        return cmsUser.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
