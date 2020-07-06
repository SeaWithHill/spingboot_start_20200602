package com.mabf.controller;


import com.mabf.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

@RestController
public class UserController1 {
    public final static Logger logger = LoggerFactory.getLogger(UserController1.class);


    @RequestMapping("getUser4445")
    @ResponseBody
    public String getUser(){
        final String vaf = "vaf";
        ReentrantLock reentrantLock = new ReentrantLock();
        ReentrantLock reentrantLock1 = new ReentrantLock(false);
        return "SpringBoot 显示中文14:31:50";
    }

    @RequestMapping("getUser4444444445")
    @ResponseBody
    public String getUser2(){
        final String vaf = "vaf";
        ReentrantLock reentrantLock = new ReentrantLock();
        ReentrantLock reentrantLock1 = new ReentrantLock(false);
        return "SpringBoot 12313213213显示中文14:31:50";

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
        synchronized (user){

        }
    }


    public static void main(String[] args) {

        String uuid = UUID.randomUUID().toString();
        System.out.print(uuid);

        logger.info("the var {},the var1{}","name","mabf");
    }
}
