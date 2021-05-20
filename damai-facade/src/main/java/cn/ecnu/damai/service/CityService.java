package cn.ecnu.damai.service;

import cn.ecnu.damai.entity.City;
import com.anoyi.grpc.annotation.GrpcService;
import com.anoyi.grpc.constant.SerializeType;

import java.util.List;

/**
 * @author Kyrie Lee
 * @date 2021/5/11 14:18
 */
@GrpcService(server = "flyme", serialization = SerializeType.PROTOSTUFF)
public interface CityService {
    List<City> getCityList();

    City findCityByName(String name);
}
