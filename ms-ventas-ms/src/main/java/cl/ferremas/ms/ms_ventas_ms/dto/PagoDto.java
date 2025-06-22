package cl.ferremas.ms.ms_ventas_ms.dto;

import java.math.BigDecimal;

public class PagoDto {
    private String buyOrder;
    private String sessionId;
    private BigDecimal amount;
    private String returnUrl;

    public PagoDto() {}

    public PagoDto(String buyOrder, String sessionId, BigDecimal amount, String returnUrl) {
        this.buyOrder = buyOrder;
        this.sessionId = sessionId;
        this.amount = amount;
        this.returnUrl = returnUrl;
    }

    // Getters y setters
    public String getBuyOrder() { return buyOrder; }
    public void setBuyOrder(String buyOrder) { this.buyOrder = buyOrder; }

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getReturnUrl() { return returnUrl; }
    public void setReturnUrl(String returnUrl) { this.returnUrl = returnUrl; }
}
