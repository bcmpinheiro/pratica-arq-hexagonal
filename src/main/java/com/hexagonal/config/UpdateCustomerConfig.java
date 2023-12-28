package com.hexagonal.config;

import com.hexagonal.adapters.FindByAddressByZipCodeAdapter;
import com.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindByAddressByZipCodeAdapter findByAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ){
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findByAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
