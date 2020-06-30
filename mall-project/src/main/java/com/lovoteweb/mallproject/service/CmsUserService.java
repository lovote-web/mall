package com.lovoteweb.mallproject.service;

import com.lovoteweb.mallproject.common.JwtTokenUtil;
import com.lovoteweb.mallproject.mbg.mapper.UmsPermissionMapper;
import com.lovoteweb.mallproject.mbg.mapper.UmsUserMapper;
import com.lovoteweb.mallproject.mbg.mapper.UmsUserpermissionrelationMapper;
import com.lovoteweb.mallproject.mbg.model.*;
import com.lovoteweb.mallproject.service.serviceImpl.CmsUserServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CmsUserService implements CmsUserServiceImpl {

    @Autowired
    UmsUserMapper umsUserMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UmsUserpermissionrelationMapper umsUserpermissionrelationMapper;

    @Autowired
    private UmsPermissionMapper umsPermissionMapper;

    @Override
    public UmsUser register(UmsUser umsUser) {
        UmsUser cmsUser1 = new UmsUser();
        BeanUtils.copyProperties(umsUser,cmsUser1);
        //注意
        UmsUserExample example = new UmsUserExample();
        example.createCriteria().andUsernameEqualTo(cmsUser1.getUsername());
        List<UmsUser> cmsUserList = umsUserMapper.selectByExample(example);
        if(cmsUserList.size() > 0){
            return null;
        }

        String encodePassword = passwordEncoder.encode(cmsUser1.getPassword());
        cmsUser1.setPassword(encodePassword);
        umsUserMapper.insert(cmsUser1);
        return cmsUser1;
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if(!passwordEncoder.matches(password,userDetails.getPassword())){
            return null;
        }
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        token = jwtTokenUtil.generateToken(userDetails);
        return token;
    }

    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {

        List<UmsPermission> umsPermissions = null;
        UmsUserpermissionrelationExample example = new UmsUserpermissionrelationExample();
        example.createCriteria().andUidEqualTo(adminId);

        List<UmsUserpermissionrelation> list = umsUserpermissionrelationMapper.selectByExample(example);
        if(list.size() >0){
            for (UmsUserpermissionrelation s : list){
                UmsPermission s1 = umsPermissionMapper.selectByPrimaryKey(s.getPid());
                umsPermissions.add(s1);
            }
        }
        return umsPermissions;

    }
}
