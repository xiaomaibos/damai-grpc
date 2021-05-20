package cn.ecnu.damai.controller;

import cn.ecnu.damai.entity.Level;
import cn.ecnu.damai.entity.Show;
import cn.ecnu.damai.service.LevelService;
import cn.ecnu.damai.service.ShowService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Kyrie Lee
 * @date 2021/5/11 15:08
 */
@Controller
@RequestMapping("/show")
@CrossOrigin
public class ShowController {

    @Resource
    private ShowService showService;
    @Resource
    private LevelService levelService;

    /**
     * keyword=&city=&category=&startTime=&endTime=&order=&pageSize=&currPage=
     *
     * @param keyWord     关键字查询
     * @param pageSize    页面大小 默认10条信息组成一页
     * @param currentPage 当前页号 默认当前页号为1
     * @return 条件过滤查询到的信息
     */
    @RequestMapping("/findShowWithFilters")
    @ResponseBody
    public PageInfo<Show> findShowWithFilters(String keyWord,
                                              @RequestParam(defaultValue = "10") Integer pageSize,
                                              @RequestParam(defaultValue = "1") Integer currentPage) {
        return showService.findShowWithFilters(keyWord, pageSize, currentPage);
    }

    @RequestMapping("/getShow")
    @ResponseBody
    public Show findShowById(Integer showId) {
        Show show = showService.findShowById(showId);
        Set<Level> levels = new HashSet<>(levelService.getLevelList(showId));
        show.setLevels(levels);
        return show;
    }
}
