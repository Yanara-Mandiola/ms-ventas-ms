package cl.ferremas.ms.ms_ventas_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsVentasMsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsVentasMsApplication.class, args);
    }
}
