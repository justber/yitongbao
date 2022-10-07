package cn.hc.servicelogin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("cn.hc.servicelogin.mapper")
public class ServiceLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceLoginApplication.class, args);
    }

}
