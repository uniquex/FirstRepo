package com.example.liquibase.Controller2;

import com.example.liquibase.Entity2.RoleEntity;
import com.example.liquibase.Model.Dto2.RoleDto;
import com.example.liquibase.Model.Request2.RoleRequest;
import com.example.liquibase.Service2.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/roles")
public class RoleController {

    private RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<RoleDto> getAllRoles(){
        return roleService.getAllRoles();
    }
    @GetMapping("/{id}")
    public RoleDto getRole(@PathVariable Integer id){
        return roleService.getRole(id);
    }
    @PostMapping
    public RoleEntity addRole(@RequestBody RoleRequest roleRequest){
        return roleService.addRole(roleRequest);
    }
    @DeleteMapping("/{id}")
    public String deleteRole(@PathVariable Integer id){
        return roleService.deleteRole(id);
    }

}
