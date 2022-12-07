package aula.projeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //habilita como servidor eureka, assim o spring sabe o que se deve fazer
public class ProjEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjEurekaApplication.class, args);
    }

}
