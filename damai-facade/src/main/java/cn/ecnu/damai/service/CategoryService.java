package cn.ecnu.damai.service;

import cn.ecnu.damai.entity.Category;
import com.anoyi.grpc.annotation.GrpcService;
import com.anoyi.grpc.constant.SerializeType;

import java.util.List;

/**
 * @author Kyrie Lee
 * @date 2021/5/11 14:01
 */
@GrpcService(server = "flyme", serialization = SerializeType.PROTOSTUFF)
public interface CategoryService {
    List<Category> getCategoryList();

}
