package pe.edu.cibertec.t1feignnumerogrupo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class T1FeignNumeroGrupoApplication {

    public static void main(String[] args) {
        SpringApplication.run(T1FeignNumeroGrupoApplication.class, args);
    }

}
