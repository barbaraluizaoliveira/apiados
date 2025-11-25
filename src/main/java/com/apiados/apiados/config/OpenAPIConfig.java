package com.apiados.apiados.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI apiadosOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API - APIADOS")
                        .description("Documentação da Plataforma de Impacto Urbano Positivo")
                        .version("1.0.0"));
    }
}
