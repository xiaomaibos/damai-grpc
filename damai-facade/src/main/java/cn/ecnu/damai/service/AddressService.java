package cn.ecnu.damai.service;

import cn.ecnu.damai.entity.Address;
import com.anoyi.grpc.annotation.GrpcService;
import com.anoyi.grpc.constant.SerializeType;

@GrpcService(server = "flyme", serialization = SerializeType.PROTOSTUFF)
public interface AddressService {

    Address addAddress(Address address);

    boolean deleteAddress(Integer addressId);

    Address getAddress(Integer addressId);
}
