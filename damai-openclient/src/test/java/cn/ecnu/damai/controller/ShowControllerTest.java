package cn.ecnu.damai.controller;

import cn.ecnu.damai.entity.Show;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowControllerTest {

    @Autowired
    private ShowController showController;

    @Test
    public void testFindProgramById() {
        Show show = showController.findShowById(67);
        System.out.println(JSON.toJSONString(show));
    }
}
