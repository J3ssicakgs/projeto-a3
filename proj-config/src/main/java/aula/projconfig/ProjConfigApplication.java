package aula.projconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //habilita como config server - diz para o spring que essa aplicação é um servidor para configuração de banco de dados
public class ProjConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjConfigApplication.class, args);
    }

}
