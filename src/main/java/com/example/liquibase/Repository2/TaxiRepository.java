package com.example.liquibase.Repository2;
import com.example.liquibase.Entity2.TaxiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxiRepository extends JpaRepository<TaxiEntity,Integer> {

    TaxiEntity getByBrandName(String brandName);
}
