package cl.ferremas.ms.ms_ventas_ms.client;

import cl.ferremas.ms.ms_ventas_ms.dto.VentaDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ms-ventas-db", url = "${ms-ventas-db.url}")
public interface VentaDbFeignClient {

    @PostMapping("/ventas")
    VentaDto crearVenta(@RequestBody VentaDto ventaDto);
}
