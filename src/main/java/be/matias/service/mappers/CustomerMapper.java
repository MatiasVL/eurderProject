package be.matias.service.mappers;

import be.matias.domain.users.Customer;
import be.matias.service.customerdto.CustomerDto;

public class CustomerMapper {
    public static CustomerDto turnCustomerIntoCustomerDto(Customer customer) {
        return new CustomerDto(
                customer.getCustomerId().toString(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                AddressMapper.turnAddressIntoAddressDto(customer.getAddress()),
                PhoneNumberMapper.turnPhoneNumberIntoPhoneNumberDto(customer.getPhoneNumber()),
                CustomerCartMapper.turnCustomerCartIntoCustomerCartDto(customer.getCustomerCart()));
    }

    public static Customer turnCustomerDtoIntoCustomer(CustomerDto customerDto) {
        return new Customer(
                customerDto.getFirstName(),
                customerDto.getLastName(),
                customerDto.getEmail(),
                AddressMapper.turnAddressDtoIntoAddress(customerDto.getAddress()),
                PhoneNumberMapper.turnPhoneNumberDtoIntoPhoneNumber(customerDto.getPhoneNumber()),
                CustomerCartMapper.turnCustomerCartDtoIntoCustomerCart(customerDto.getCustomerCart()));
    }
}
