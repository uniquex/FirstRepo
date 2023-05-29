/*
package com.example.liquibase.Service;

import com.example.liquibase.Entity.ClubEntity;
import com.example.liquibase.Exception.ClubException;
import com.example.liquibase.Model.Mapper.ClubMapper;
import com.example.liquibase.Model.Dto.ClubDto;
import com.example.liquibase.Model.Request.ClubRequest;
import com.example.liquibase.Repository.ClubRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ClubService {

    @Autowired
    private ClubRepository clubRepository;


    public ClubEntity addClub(ClubRequest clubRequest) {
        log.info("ActionLog.info.addClub method");
        ClubEntity clubEntity = ClubMapper.INSTANCE.requestToEntity(clubRequest);
        return clubRepository.save(clubEntity);
    }

    public List<ClubDto> getAllClubs() {
        log.info("ActionLog.info.getAllClubs method");
        return ClubMapper.INSTANCE.EntityToDtoList(clubRepository.findAll());
    }

    public ClubDto getClubById(Integer id) {
        ClubEntity clubEntity = clubRepository.findById(id).orElseThrow(() -> {
            log.error("ActionLog.error.getClubById entered id: {} does not exist!",id);
                    throw new ClubException("That id does not exist!");
                }
        );
        return ClubMapper.INSTANCE.entityToDto(clubEntity);
    }

}
*/
