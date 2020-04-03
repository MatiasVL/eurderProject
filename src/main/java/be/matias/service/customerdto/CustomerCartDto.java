package be.matias.service.customerdto;

import be.matias.service.orderdto.ItemGroupDto;

import java.util.List;

public class CustomerCartDto {
    private List<ItemGroupDto> itemGroupDtos;

    public CustomerCartDto(List<ItemGroupDto> itemGroupDtos) {
        this.itemGroupDtos = itemGroupDtos;
    }

    public List<ItemGroupDto> getItemGroupDtos() {
        return itemGroupDtos;
    }
}
