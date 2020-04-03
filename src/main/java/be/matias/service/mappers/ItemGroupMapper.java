package be.matias.service.mappers;

import be.matias.domain.items.ItemGroup;
import be.matias.domain.users.userinfo.CustomerCart;
import be.matias.service.orderdto.ItemGroupDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ItemGroupMapper {
    public static ItemGroupDto turnItemGroupIntoItemGroupDto (ItemGroup itemGroup){
        return new ItemGroupDto(itemGroup.getItemId().toString(),itemGroup.getAmount(),itemGroup.getShippingDate().toString());
    }

    public static ItemGroup turnItemGroupDtoIntoItemGroup (ItemGroupDto itemGroupDto){
        return new ItemGroup(UUID.fromString(itemGroupDto.getItemId()),itemGroupDto.getAmount(),LocalDate.parse(itemGroupDto.getShippingDate()));
    }

    public static List<ItemGroup> turnItemGroupDtoListIntoItemGroupList (List<ItemGroupDto> itemGroupDtoList){
        List<ItemGroup> itemGroupList = new ArrayList<>();
        for (ItemGroupDto itemGroupDto: itemGroupDtoList
        ) {itemGroupList.add(ItemGroupMapper.turnItemGroupDtoIntoItemGroup(itemGroupDto));
        }
        return itemGroupList;
    }

    public static List<ItemGroupDto> turnItemGroupListIntoItemGroupDtoList (List<ItemGroup> itemGroupList){
        List<ItemGroupDto> itemGroupDtoList = new ArrayList<>();
        for (ItemGroup itemGroup: itemGroupList
        ) {itemGroupDtoList.add(ItemGroupMapper.turnItemGroupIntoItemGroupDto(itemGroup));
        }
        return itemGroupDtoList;
    }
}
