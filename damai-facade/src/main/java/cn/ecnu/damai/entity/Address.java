package cn.ecnu.damai.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Kyrie Lee
 * @date 2021/5/12 22:38
 */
@Data
@Entity
@Table(name = "address")
public class Address implements Serializable {
    private static final long serialVersionUID = 0L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer addressId;
    private String name;
    private String phone;
    private String detail;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "is_delete")
    private Integer isDelete = 0;

    @Transient
    private User user;
}
