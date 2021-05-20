package cn.ecnu.damai.service;

import cn.ecnu.damai.entity.Program;
import com.anoyi.grpc.annotation.GrpcService;
import com.anoyi.grpc.constant.SerializeType;

@GrpcService(server = "flyme", serialization = SerializeType.PROTOSTUFF)
public interface DamaiCrawlService {

    String crawlProblemByCode(String code, Program program);
}
