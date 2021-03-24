package com.example.whj.consoller;

import com.alibaba.fastjson.JSON;
import com.example.whj.entity.User;
import com.example.whj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserConsoller {
    @Autowired
    private UserService userService;

    @GetMapping("/select")
    @ResponseBody
    public String SelInfo(){
        List<User> list = userService.selUserInfo();
        return JSON.toJSONString(list);
    }
}
