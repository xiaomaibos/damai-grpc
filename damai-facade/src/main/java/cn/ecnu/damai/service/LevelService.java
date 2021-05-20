package cn.ecnu.damai.service;

import cn.ecnu.damai.entity.Level;
import com.anoyi.grpc.annotation.GrpcService;
import com.anoyi.grpc.constant.SerializeType;

import java.util.List;

/**
 * @author Kyrie Lee
 * @date 2021/5/13 15:47
 */
@GrpcService(server = "flyme", serialization = SerializeType.PROTOSTUFF)
public interface LevelService {

    List<Level> getLevelList(Integer showId);

    int addLevel(Level level);

    Level getLevel(Integer levelId);

    Level updateLevel(Level level);
}
