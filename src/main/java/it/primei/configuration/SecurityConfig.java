package it.primei.configuration;

import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Log4j2
public class SecurityConfig {

    @Value("${it.primei.ccp.url}")
    private String ccpUrl;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(@NotNull CorsRegistry registry) {
                log.info("Configuring CORS for {}", ccpUrl);
                registry.addMapping("/**")
                        .allowedOrigins(ccpUrl)
                        .allowedMethods("*");
            }
        };
    }
}
