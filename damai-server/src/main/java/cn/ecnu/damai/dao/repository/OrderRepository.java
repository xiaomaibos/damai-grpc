package cn.ecnu.damai.dao.repository;

import cn.ecnu.damai.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer>, JpaSpecificationExecutor<Order> {
    List<Order> findByUserId(Integer userId);
}
