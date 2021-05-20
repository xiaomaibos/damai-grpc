package cn.ecnu.damai.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author Kyrie Lee
 * @date 2021/5/11 13:56
 */
@Data
@Entity
@Table(name = "category")
public class Category implements Serializable {
    private static final long serialVersionUID = 0L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer cid;
    private String name;
    private Integer count;

    @Transient
    private Set<Program> programs;
}
