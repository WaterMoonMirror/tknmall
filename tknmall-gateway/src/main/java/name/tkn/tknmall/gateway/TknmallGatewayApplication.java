package name.tkn.tknmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TknmallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TknmallGatewayApplication.class, args);
    }

}
