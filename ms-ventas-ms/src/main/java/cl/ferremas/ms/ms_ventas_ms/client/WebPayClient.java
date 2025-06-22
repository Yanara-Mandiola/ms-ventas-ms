package cl.ferremas.ms.ms_ventas_ms.client;

import cl.ferremas.ms.ms_ventas_ms.dto.PagoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "webpay-client", url = "${webpay.api.url}")
public interface WebPayClient {

    @PostMapping("/api/v1/transactions") // Ajusta según doc de producción WebPay
    String crearTransaccion(@RequestBody PagoDto pagoDto);
}
