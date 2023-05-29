package com.example.liquibase.Model.Mapper2;

import com.example.liquibase.Entity2.RoleEntity;
import com.example.liquibase.Model.Dto2.RoleDto;
import com.example.liquibase.Model.Request2.RoleRequest;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-13T13:52:32+0400",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
public class RoleMapperImpl extends RoleMapper {

    @Override
    public RoleEntity requestToEntity(RoleRequest roleRequest) {
        if ( roleRequest == null ) {
            return null;
        }

        RoleEntity roleEntity = new RoleEntity();

        roleEntity.setName( roleRequest.getName() );

        return roleEntity;
    }

    @Override
    public List<RoleDto> entityToDtoList(List<RoleEntity> roleEntities) {
        if ( roleEntities == null ) {
            return null;
        }

        List<RoleDto> list = new ArrayList<RoleDto>( roleEntities.size() );
        for ( RoleEntity roleEntity : roleEntities ) {
            list.add( entityToDto( roleEntity ) );
        }

        return list;
    }

    @Override
    public RoleDto entityToDto(RoleEntity roleEntity) {
        if ( roleEntity == null ) {
            return null;
        }

        RoleDto roleDto = new RoleDto();

        roleDto.setName( roleEntity.getName() );

        return roleDto;
    }
}
