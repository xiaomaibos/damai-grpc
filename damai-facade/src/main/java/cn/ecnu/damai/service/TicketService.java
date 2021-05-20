package cn.ecnu.damai.service;

import cn.ecnu.damai.entity.Ticket;
import com.anoyi.grpc.annotation.GrpcService;
import com.anoyi.grpc.constant.SerializeType;

@GrpcService(server = "flyme", serialization = SerializeType.PROTOSTUFF)
public interface TicketService {
    Ticket addTicket(Ticket ticket);

    Ticket getTicket(Integer ticketId);
}
