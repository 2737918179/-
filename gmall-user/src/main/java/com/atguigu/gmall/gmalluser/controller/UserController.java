package com.atguigu.gmall.gmalluser.controller;


import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class

UserController {
    @Resource
    UserService userService;

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses=userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers=userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hell   user";
    }
}


