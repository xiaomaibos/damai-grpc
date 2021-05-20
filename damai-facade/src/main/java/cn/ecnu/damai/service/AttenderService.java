package cn.ecnu.damai.service;

import cn.ecnu.damai.entity.Attender;
import com.anoyi.grpc.annotation.GrpcService;
import com.anoyi.grpc.constant.SerializeType;

@GrpcService(server = "flyme", serialization = SerializeType.PROTOSTUFF)
public interface AttenderService{

    Attender addAttender(Attender attender);

    boolean deleteAttender(Integer attenderId);

    Attender getAttender(Integer attenderId);
}
