package cl.ferremas.ms.ms_ventas_ms.dto;

import java.math.BigDecimal;
import java.util.List;

public class VentaDto {
    private Long id;
    private Long clienteId;
    private BigDecimal total;
    private List<DetalleVentaDto> detalles;

    public VentaDto() {}

    public VentaDto(Long id, Long clienteId, BigDecimal total, List<DetalleVentaDto> detalles) {
        this.id = id;
        this.clienteId = clienteId;
        this.total = total;
        this.detalles = detalles;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getClienteId() { return clienteId; }
    public void setClienteId(Long clienteId) { this.clienteId = clienteId; }

    public BigDecimal getTotal() { return total; }
    public void setTotal(BigDecimal total) { this.total = total; }

    public List<DetalleVentaDto> getDetalles() { return detalles; }
    public void setDetalles(List<DetalleVentaDto> detalles) { this.detalles = detalles; }
}
