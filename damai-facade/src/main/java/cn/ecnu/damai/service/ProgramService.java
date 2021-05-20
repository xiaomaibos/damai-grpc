package cn.ecnu.damai.service;

import cn.ecnu.damai.entity.Program;
import com.anoyi.grpc.annotation.GrpcService;
import com.anoyi.grpc.constant.SerializeType;
import com.github.pagehelper.PageInfo;

/**
 * @author Kyrie Lee
 * @date 2021/5/11 14:52
 */
@GrpcService(server = "flyme", serialization = SerializeType.PROTOSTUFF)
public interface ProgramService {
    Program findProgramById(Integer programId);

    PageInfo<Program> findProgramWithFilters(String keyWord, Integer city, Integer category, int pageSize, int currPage, String startTime, String endTime, Integer order);

    int addProgram(Program program);
}
