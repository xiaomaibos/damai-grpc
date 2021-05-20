package cn.ecnu.damai.controller;

import cn.ecnu.damai.controller.Response.ResultMap;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminControllerTest {

    @Autowired
    private AdminController adminController;

    @Test
    public void testCrawlProgramByCode() {
        ResultMap resMap = adminController.crawlProgramByCode("644431227376");
        System.out.println(JSON.toJSONString(resMap));
    }

    @Test
    public void testGetAddress() {
        ResultMap result = adminController.getAddress(2);
        System.out.println(result);
    }
}
