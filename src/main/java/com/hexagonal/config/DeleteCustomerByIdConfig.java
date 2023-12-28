package com.hexagonal.config;

import com.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ){
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase,deleteCustomerByIdAdapter);
    }
}
