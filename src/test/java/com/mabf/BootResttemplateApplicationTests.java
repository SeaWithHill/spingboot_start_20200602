package com.mabf;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AppRun.class})
public class BootResttemplateApplicationTests {
    @Autowired
    private RestTemplate restTemplate;


    /**
     * 测试get请求
     */
    @Test
    public void test1() {
        /**
         * getForObject
         *
         * 参数1 要请求的地址的url  必填项
         * 参数2 响应数据的类型 是String 还是 Map等 必填项
         * 参数3 请求携带参数 选填
         *
         * getForObject 方法的返回值就是 被调用接口响应的数据
         */
        String result = restTemplate.getForObject("http://localhost:8802/product/showProductById?id=1", String.class);

        System.out.println(result);
    }


}
