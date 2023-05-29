package com.example.liquibase.Service2.auth;


import com.example.liquibase.Entity2.TaxiEntity;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

@Data
public class CustomUserDetails implements UserDetails {

    private TaxiEntity taxiEntity;

    public CustomUserDetails(TaxiEntity taxiEntity) {
        this.taxiEntity = taxiEntity;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return taxiEntity.getRoleEntityList()
                .stream()
                .map(entity -> new SimpleGrantedAuthority(entity.getName()))
                .collect(Collectors.toList());

    }

    @Override
    public String getPassword() {
        return taxiEntity.getVehicleNumber();
    }

    @Override
    public String getUsername() {
        return taxiEntity.getBrandName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
