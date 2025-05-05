package learning.web.server.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Optional;

@Component
public class WebMvcConfigProvider {
    @Bean
    public WebMvcConfigurer corsConfigure (
            @Value ("${learning.web.allowed-host:#{null}}") Optional<String> allowedHost) {
        return new WebMvcConfigurer () {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                allowedHost.ifPresent (h -> {
                    registry.addMapping ("/**")
                            .allowedOrigins (h)
                            .allowedHeaders (CorsConfiguration.ALL)
                            .allowedMethods (CorsConfiguration.ALL);
                });
            }
        };
    }
}
