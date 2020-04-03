package be.matias.service.mappers;

import be.matias.domain.users.userinfo.Address;
import be.matias.service.customerdto.AddressDto;

public class AddressMapper {
    public static AddressDto turnAddressIntoAddressDto (Address address) {
        return new AddressDto(address.getStreet(),address.getHousenumber(),address.getPostalCode(),address.getCity());
    }

    public static Address turnAddressDtoIntoAddress (AddressDto addressDto) {
        return new Address(addressDto.getStreet(),addressDto.getHousenumber(),addressDto.getPostalCode(),addressDto.getCity());
    }
}
