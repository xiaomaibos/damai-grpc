package cn.ecnu.damai;

import com.anoyi.grpc.annotation.GrpcServiceScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@GrpcServiceScan(packages = {"cn.ecnu.damai"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}