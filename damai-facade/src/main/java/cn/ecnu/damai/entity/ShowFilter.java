package cn.ecnu.damai.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Kyrie Lee
 * @date 2021/5/11 15:19
 */
@Data
public class ShowFilter implements Serializable {
    private static final long serialVersionUID = 0L;
    private String keyWord;
    private int pageSize;
    private int currentPage;
}
