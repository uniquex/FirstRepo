package com.example.liquibase.Model.Mapper2;


import com.example.liquibase.Entity2.RoleEntity;
import com.example.liquibase.Model.Dto2.RoleDto;
import com.example.liquibase.Model.Request2.RoleRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class RoleMapper {

    public final static RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    public abstract RoleEntity requestToEntity(RoleRequest roleRequest);
    public abstract List<RoleDto> entityToDtoList(List<RoleEntity> roleEntities);
    public abstract RoleDto entityToDto(RoleEntity roleEntity);
}
