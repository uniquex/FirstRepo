package com.example.liquibase.Service2;


import com.example.liquibase.Entity2.RoleEntity;
import com.example.liquibase.Model.Dto2.RoleDto;
import com.example.liquibase.Model.Mapper2.RoleMapper;
import com.example.liquibase.Model.Request2.RoleRequest;
import com.example.liquibase.Repository2.RoleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class RoleService {
    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<RoleDto> getAllRoles() {
        return RoleMapper.INSTANCE.entityToDtoList(roleRepository.findAll());
    }

    public RoleDto getRole(Integer id) {
        return RoleMapper.INSTANCE.entityToDto(roleRepository.getById(id));
    }

    public RoleEntity addRole(RoleRequest roleRequest) {
        RoleEntity newRole = RoleMapper.INSTANCE.requestToEntity(roleRequest);
        roleRepository.save(newRole);
        return newRole;
    }

    public String deleteRole(Integer id) {
        roleRepository.deleteById(id);
        return "ROLE_WAS_DELETED_SUCCESFULLY!";
    }
}
