package com.mabf.controller;


import com.mabf.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UserController {


    @RequestMapping("getUser")
    @ResponseBody
    public String getUser(){
        final String vaf = "vaf";
        return "SpringBoot 热部署2020年6月27日14:31:50";

    }

    public static void test() {
        User user = new User();
        String last_modi_date = user.getLast_modi_date();
        ArrayList<Object> newname = new ArrayList<>();
        ArrayList<Object> newname2 = new ArrayList<>();
        for (Object o : newname2) {

        }
        ArrayList<Object> objects = new ArrayList<>();
        String s = "this";
        String is_open = user.getIs_open();
    }

}
