package cl.ferremas.ms.ms_ventas_ms.service;

import cl.ferremas.ms.ms_ventas_ms.client.VentaDbFeignClient;
import cl.ferremas.ms.ms_ventas_ms.client.WebPayClient;
import cl.ferremas.ms.ms_ventas_ms.config.WebpayConfig;
import cl.ferremas.ms.ms_ventas_ms.dto.PagoDto;
import cl.ferremas.ms.ms_ventas_ms.dto.VentaDto;
import org.springframework.stereotype.Service;

@Service
public class VentaService {

    private final VentaDbFeignClient ventaDbFeignClient;
    private final WebPayClient webPayClient;
    private final WebpayConfig webpayConfig;

    public VentaService(VentaDbFeignClient ventaDbFeignClient, WebPayClient webPayClient, WebpayConfig webpayConfig) {
        this.ventaDbFeignClient = ventaDbFeignClient;
        this.webPayClient = webPayClient;
        this.webpayConfig = webpayConfig;
    }

    public VentaDto crearVenta(VentaDto venta) {
        // Validaciones y lógica adicional pueden agregarse aquí
        return ventaDbFeignClient.crearVenta(venta);
    }

    public String procesarPago(PagoDto pagoDto) {
        // Aquí se debería construir la petición completa a WebPay, incluyendo credenciales y estructura esperada
        return webPayClient.crearTransaccion(pagoDto);
    }
}
