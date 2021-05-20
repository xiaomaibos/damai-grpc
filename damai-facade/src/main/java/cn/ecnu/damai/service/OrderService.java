package cn.ecnu.damai.service;

import cn.ecnu.damai.entity.Order;
import com.anoyi.grpc.annotation.GrpcService;
import com.anoyi.grpc.constant.SerializeType;

import java.util.List;

@GrpcService(server = "flyme", serialization = SerializeType.PROTOSTUFF)
public interface OrderService {
    Order addOrder(Order order);

    List<Order> getOrderList(Integer userId);

    Order getOrder(Integer orderId);
}
