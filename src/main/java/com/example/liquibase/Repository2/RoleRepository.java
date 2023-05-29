package com.example.liquibase.Repository2;

import com.example.liquibase.Entity2.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<RoleEntity,Integer> {



}
