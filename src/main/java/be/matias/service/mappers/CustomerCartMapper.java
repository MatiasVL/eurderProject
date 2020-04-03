package be.matias.service.mappers;

import be.matias.domain.users.userinfo.CustomerCart;
import be.matias.service.customerdto.CustomerCartDto;

public class CustomerCartMapper {
    public static CustomerCartDto turnCustomerCartIntoCustomerCartDto (CustomerCart customerCart){
        return new CustomerCartDto(ItemGroupMapper.turnItemGroupListIntoItemGroupDtoList(customerCart.getItemGroups()));
    }

    public static CustomerCart turnCustomerCartDtoIntoCustomerCart (CustomerCartDto customerCartDto){
        return new CustomerCart(ItemGroupMapper.turnItemGroupDtoListIntoItemGroupList(customerCartDto.getItemGroupDtos()));
    }
}
