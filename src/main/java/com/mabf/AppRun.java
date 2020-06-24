package com.mabf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启动类规则
 * 1.启动类位置：主包下面和子包同级
 * 2.需要一个@SpringBootApplication
 */
@MapperScan("com.mabf.dao")
@SpringBootApplication
@ServletComponentScan
public class AppRun {
    public static void main(String[] args) {
//        参数：启动类类对象 主函数形参名
        SpringApplication.run(AppRun.class, args);
    }

//    @Bean
//    public  FilterRegistrationBean filter(UserFilter userFilter){
//        FilterRegistrationBean  filterRegistration1 = new FilterRegistrationBean();
//        filterRegistration1.setFilter(userFilter);
//        filterRegistration1.setName("userFilter");
//        filterRegistration1.addUrlPatterns("/*");
//        filterRegistration1.setOrder(10);
//        return  filterRegistration1;
//    }
//
//    @Bean
//    public FilterRegistrationBean filter1(UserFilter1 userFilter1){
//        FilterRegistrationBean filterRegistrationBean1 = new FilterRegistrationBean();
//        filterRegistrationBean1.setFilter(userFilter1);
//        filterRegistrationBean1.setName("userFilter1");
//        filterRegistrationBean1.addUrlPatterns("/*");
//        filterRegistrationBean1.setOrder(10);
//        return  filterRegistrationBean1;
//
//
//    }
//
//    @Bean
//    public UserFilter userFilter(){
//        return new UserFilter();
//    }
//    @Bean
//    public UserFilter1 userFilter1(){
//        return new UserFilter1();
//    }




}
