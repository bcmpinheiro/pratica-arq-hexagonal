package com.hexagonal.config;

import com.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter
    ){
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
