package com.example.liquibase.Service2;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("permissionService")
public class PermissionService {

    public boolean hasPermission(List<String> permissionKeys){
        var roles =
                SecurityContextHolder.getContext().getAuthentication().getAuthorities();

        var rolesInText = roles.stream().map(GrantedAuthority::getAuthority).toList();

        return rolesInText.stream().anyMatch(permissionKeys::contains);
    }
}
