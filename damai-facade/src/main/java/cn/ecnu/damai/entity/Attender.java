package cn.ecnu.damai.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Kyrie Lee
 * @date 2021/5/12 22:41
 */
@Data
@Entity
@Table(name = "attender")
public class Attender implements Serializable {
    private static final long serialVersionUID = 0L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String name;
    @Column(name = "identity_type")
    private String identityType;
    @Column(name = "identity_num")
    private String identityNum;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "is_delete")
    private Integer isDelete = 0;

    @Transient
    private User user;

}
