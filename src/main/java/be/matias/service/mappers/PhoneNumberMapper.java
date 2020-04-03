package be.matias.service.mappers;

import be.matias.domain.users.userinfo.PhoneNumber;
import be.matias.service.customerdto.PhoneNumberDto;

public class PhoneNumberMapper {
    public static PhoneNumberDto turnPhoneNumberIntoPhoneNumberDto (PhoneNumber phoneNumber) {
        return new PhoneNumberDto(phoneNumber.getAreaCode(),phoneNumber.getNumber());
    }

    public static PhoneNumber turnPhoneNumberDtoIntoPhoneNumber (PhoneNumberDto phoneNumberDto) {
        return new PhoneNumber(phoneNumberDto.getAreaCode(),phoneNumberDto.getNumber());
    }
}
