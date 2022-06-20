package com.hagos.WebScrape.configs;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI xmlOpenApi() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("ESPN: 2021-22 John Hollinger NBA Player Statistics - All Players")
                                .version("1.0.0")
                                .license(new License()
                                        .name("Dawit Hagos")))
                .externalDocs(
                        new ExternalDocumentation()
                                .description("ESPN Web Scraper")
                                .url("https://github.com/dawhagos/WebScraper1")
                );
    }
}