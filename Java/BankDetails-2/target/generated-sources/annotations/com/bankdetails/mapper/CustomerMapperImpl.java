package com.bankdetails.mapper;

import com.bankdetails.dto.CustomerDto;
import com.bankdetails.entity.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-28T14:11:06+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements EntityMapper<CustomerDto, Customer> {

    @Override
    public Customer toEntity(CustomerDto dto) {
        if ( dto == null ) {
            return null;
        }

        Customer customer = new Customer();

        return customer;
    }

    @Override
    public CustomerDto toDto(Customer entity) {
        if ( entity == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        return customerDto;
    }

    @Override
    public List<Customer> toEntity(List<CustomerDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Customer> list = new ArrayList<Customer>( dtoList.size() );
        for ( CustomerDto customerDto : dtoList ) {
            list.add( toEntity( customerDto ) );
        }

        return list;
    }

    @Override
    public List<CustomerDto> toDto(List<Customer> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CustomerDto> list = new ArrayList<CustomerDto>( entityList.size() );
        for ( Customer customer : entityList ) {
            list.add( toDto( customer ) );
        }

        return list;
    }
}
