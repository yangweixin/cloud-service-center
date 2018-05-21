package top.oyoung.cloudservicecenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudServiceCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServiceCenterApplication.class, args);
    }
}
