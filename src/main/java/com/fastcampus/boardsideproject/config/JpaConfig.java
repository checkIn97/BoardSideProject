package com.fastcampus.boardsideproject.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
@ComponentScan(basePackages = "com.fastcampus.boardsideproject.*")
public class JpaConfig {

    @Bean
    public AuditorAware<String> auditorAware() {
        return () -> Optional.of("san"); // TODO: 스프링 시큐리티로 인증 기능을 붙이게 될 떄, 수정하자.
    }
}
