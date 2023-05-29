package com.example.liquibase.Model.Mapper2;
import com.example.liquibase.Entity2.TaxiEntity;
import com.example.liquibase.Model.Dto2.TaxiDto;
import com.example.liquibase.Model.Request2.TaxiRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper
public abstract class TaxiMapper {

    public final static TaxiMapper INSTANCE = Mappers.getMapper(TaxiMapper.class);

    public abstract TaxiEntity requestToEntity(TaxiRequest taxiRequest);

    public abstract List<TaxiDto> entityToDtoList(List<TaxiEntity> taxiEntities);

    @Mapping(source = "roleEntityList", target = "roleEntityList")
    public abstract TaxiDto entityToDto(TaxiEntity taxiEntity);


}
