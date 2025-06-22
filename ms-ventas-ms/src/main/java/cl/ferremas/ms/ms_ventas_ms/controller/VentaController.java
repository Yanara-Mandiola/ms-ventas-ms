package cl.ferremas.ms.ms_ventas_ms.controller;

import cl.ferremas.ms.ms_ventas_ms.dto.PagoDto;
import cl.ferremas.ms.ms_ventas_ms.dto.VentaDto;
import cl.ferremas.ms.ms_ventas_ms.service.VentaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @PostMapping
    public ResponseEntity<VentaDto> crearVenta(@RequestBody VentaDto venta) {
        VentaDto nuevaVenta = ventaService.crearVenta(venta);
        return ResponseEntity.ok(nuevaVenta);
    }

    @PostMapping("/pago")
    public ResponseEntity<String> pagarVenta(@RequestBody PagoDto pago) {
        String urlPago = ventaService.procesarPago(pago);
        return ResponseEntity.ok(urlPago);
    }
}
