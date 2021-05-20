package cn.ecnu.damai.controller;

import cn.ecnu.damai.entity.City;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CityControllerTest {
    @Autowired
    private CityController cityController;

    @Test
    public void testCrawlProgramByCode() {
        List<City> cities = cityController.getCityList();
        System.out.println(JSON.toJSONString(cities));
    }
}
