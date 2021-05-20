package cn.ecnu.damai.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author Kyrie Lee
 * @date 2021/5/11 14:16
 */
@Data
@Entity
@Table(name = "city")
public class City implements Serializable {
    private static final long serialVersionUID = 0L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer cityId;
    private String name;
    private String code;
    private Integer count;

    @Transient
    private Set<Program> programs;
}
