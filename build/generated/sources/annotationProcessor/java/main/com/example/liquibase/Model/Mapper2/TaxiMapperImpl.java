package com.example.liquibase.Model.Mapper2;

import com.example.liquibase.Entity2.RoleEntity;
import com.example.liquibase.Entity2.TaxiEntity;
import com.example.liquibase.Entity2.TaxiEntity.TaxiEntityBuilder;
import com.example.liquibase.Model.Dto2.TaxiDto;
import com.example.liquibase.Model.Request2.TaxiRequest;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-13T13:52:32+0400",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
public class TaxiMapperImpl extends TaxiMapper {

    @Override
    public TaxiEntity requestToEntity(TaxiRequest taxiRequest) {
        if ( taxiRequest == null ) {
            return null;
        }

        TaxiEntityBuilder taxiEntity = TaxiEntity.builder();

        taxiEntity.brandName( taxiRequest.getBrandName() );
        taxiEntity.driverName( taxiRequest.getDriverName() );
        taxiEntity.vehicleNumber( taxiRequest.getVehicleNumber() );

        return taxiEntity.build();
    }

    @Override
    public List<TaxiDto> entityToDtoList(List<TaxiEntity> taxiEntities) {
        if ( taxiEntities == null ) {
            return null;
        }

        List<TaxiDto> list = new ArrayList<TaxiDto>( taxiEntities.size() );
        for ( TaxiEntity taxiEntity : taxiEntities ) {
            list.add( entityToDto( taxiEntity ) );
        }

        return list;
    }

    @Override
    public TaxiDto entityToDto(TaxiEntity taxiEntity) {
        if ( taxiEntity == null ) {
            return null;
        }

        TaxiDto taxiDto = new TaxiDto();

        List<RoleEntity> list = taxiEntity.getRoleEntityList();
        if ( list != null ) {
            taxiDto.setRoleEntityList( new ArrayList<RoleEntity>( list ) );
        }
        taxiDto.setBrandName( taxiEntity.getBrandName() );
        taxiDto.setDriverName( taxiEntity.getDriverName() );
        taxiDto.setVehicleNumber( taxiEntity.getVehicleNumber() );
        taxiDto.setCreatedAt( taxiEntity.getCreatedAt() );

        return taxiDto;
    }
}
