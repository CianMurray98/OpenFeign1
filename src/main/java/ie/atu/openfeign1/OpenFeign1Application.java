package ie.atu.openfeign1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenFeign1Application {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeign1Application.class, args);
    }

}
