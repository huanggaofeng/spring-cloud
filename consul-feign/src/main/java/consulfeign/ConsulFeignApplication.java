package consulfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
// 注册到服务中心
@EnableDiscoveryClient
// 开启feign功能
@EnableFeignClients
public class ConsulFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulFeignApplication.class, args);
    }

}
