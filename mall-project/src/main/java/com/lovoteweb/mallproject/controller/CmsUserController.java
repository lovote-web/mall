package com.lovoteweb.mallproject.controller;

import com.lovoteweb.mallproject.common.CommonResult;
import com.lovoteweb.mallproject.mbg.model.UmsPermission;
import com.lovoteweb.mallproject.mbg.model.UmsUser;
import com.lovoteweb.mallproject.service.CmsUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 后台用户管理
 */

@Controller
@Api(tags = "CmsUserController",description = "后台用户管理")
@RequestMapping("/admin")
public class CmsUserController {
    @Autowired
    private CmsUserService cmsUserService;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> register(@RequestBody UmsUser cmsUser, BindingResult result){
        UmsUser cmsUser1 = cmsUserService.register(cmsUser);
        if(cmsUser1 == null){
            return CommonResult.failed("注册失败");
        }
        return CommonResult.success(cmsUser1);
    }

    @ApiOperation(value = "登录后返回token")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody UmsUser cmsUser,BindingResult result){
        String token = cmsUserService.login(cmsUser.getUsername(),cmsUser.getPassword());
        if(token == null){
            return CommonResult.failed("用户名");
        }
        Map<String,String> tokenMap = new HashMap<>();
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation("获取用户所有权限（包括+-权限）")
    @RequestMapping(value = "/permission/{adminId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Object> getPermissionList(@PathVariable Long adminId) {
        List<UmsPermission> permissionList = cmsUserService.getPermissionList(adminId);
        return CommonResult.success(permissionList);
    }
}
