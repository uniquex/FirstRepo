package com.example.liquibase.Service2.auth;

import com.example.liquibase.Repository2.TaxiRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomUserDetailsService implements UserDetailsService {

    private TaxiRepository taxiRepository;

    public CustomUserDetailsService(TaxiRepository taxiRepository) {
        this.taxiRepository = taxiRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("actionlog.info.loadUserByUsername method!");
        var taxiEntity = taxiRepository.getByBrandName(username);
        if(taxiEntity==null) {
            log.error("actinolog.error.loadUserByUsername ENTITY_IS_NULL!");
            throw new RuntimeException("THIS_BRAND_NAME_DOES_NOT_EXIST!");
        };
        return new CustomUserDetails(taxiEntity);
    }
}
