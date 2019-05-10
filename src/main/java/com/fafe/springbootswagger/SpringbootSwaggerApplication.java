package com.fafe.springbootswagger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootSwaggerApplication {

    private final Logger logger = LoggerFactory.getLogger(SpringbootSwaggerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSwaggerApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(final DataInitializer initializer) {
        return new CommandLineRunner() {
            @Override
            public void run(String... arg0) throws Exception {
                logger.info(
                        "\n ******** Initializing Data ***********");
                initializer.initData();
            }
        };
    }
}
