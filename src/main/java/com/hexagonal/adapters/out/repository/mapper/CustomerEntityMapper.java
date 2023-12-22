package com.hexagonal.adapters.out.repository.mapper;

import com.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
