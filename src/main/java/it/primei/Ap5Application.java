package it.primei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ap5Application {

    public static void main(String[] args) {
        SpringApplication.run(Ap5Application.class, args);
    }

}
