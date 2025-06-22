package cl.ferremas.ms.ms_ventas_ms.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebpayConfig {

    @Value("${webpay.commerce.code}")
    private String commerceCode;

    @Value("${webpay.api.key}")
    private String apiKey;

    @Value("${webpay.api.url}")
    private String apiUrl;

    public String getCommerceCode() {
        return commerceCode;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getApiUrl() {
        return apiUrl;
    }
}
