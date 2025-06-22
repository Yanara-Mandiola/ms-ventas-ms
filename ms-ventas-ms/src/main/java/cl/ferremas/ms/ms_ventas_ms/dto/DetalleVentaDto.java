package cl.ferremas.ms.ms_ventas_ms.dto;

import java.math.BigDecimal;

public class DetalleVentaDto {
    private Long productoId;
    private Integer cantidad;
    private BigDecimal precioUnitario;

    public DetalleVentaDto() {}

    public DetalleVentaDto(Long productoId, Integer cantidad, BigDecimal precioUnitario) {
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // Getters y setters
    public Long getProductoId() { return productoId; }
    public void setProductoId(Long productoId) { this.productoId = productoId; }

    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }

    public BigDecimal getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(BigDecimal precioUnitario) { this.precioUnitario = precioUnitario; }
}
