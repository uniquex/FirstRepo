package com.example.liquibase.Model.Dto2;


import com.example.liquibase.Entity2.RoleEntity;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class TaxiDto {

    String brandName;
    String driverName;
    String vehicleNumber;
    LocalDateTime createdAt;
    List<RoleEntity> roleEntityList;
}

