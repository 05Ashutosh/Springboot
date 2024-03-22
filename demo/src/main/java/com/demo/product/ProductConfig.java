package com.demo.product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Configuration
public class ProductConfig {
    @Bean
    CommandLineRunner commandLineRunner(ProductRepository repository){
        return args->{
            Product pro1 = new Product("Product1", "Description1", new BigDecimal("10.00"), 100, null, new Timestamp(System.currentTimeMillis()), 1);
            Product pro2 = new Product("Product2", "Description2", new BigDecimal("20.00"), 200, null, new Timestamp(System.currentTimeMillis()), 2);
            repository.saveAll(List.of(pro1,pro2));
        };
    }
}
