package com.hexagonal.config;

import com.hexagonal.adapters.FindByAddressByZipCodeAdapter;
import com.hexagonal.adapters.out.InsertCustomerAdapter;
import com.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindByAddressByZipCodeAdapter findByAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ){
        return new InsertCustomerUseCase(findByAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
