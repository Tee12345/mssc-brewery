package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements  CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder().customerId(UUID.randomUUID())
                .name("Mark Fish")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {

        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo - would add a real Impl later
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Deleting customer");
    }
}
