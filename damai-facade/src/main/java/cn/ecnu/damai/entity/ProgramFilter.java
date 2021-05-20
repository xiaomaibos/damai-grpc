package cn.ecnu.damai.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Kyrie Lee
 * @date 2021/5/12 17:10
 */
@Data
public class ProgramFilter implements Serializable {
    private static final long serialVersionUID = 0L;

    private String keyWord;
    private Integer city;
    private Integer category;
    private String startTime;
    private String endTime;
    private Integer order;
}
