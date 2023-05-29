/*
package com.example.liquibase.Service;

import com.example.liquibase.Entity.PlayerEntity;
import com.example.liquibase.Exception.PlayerException;
import com.example.liquibase.Model.Mapper.PlayerMapper;
import com.example.liquibase.Model.Dto.PlayerDto;
import com.example.liquibase.Model.Request.PlayerRequest;
import com.example.liquibase.Repository.PlayerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public PlayerEntity addPlayer(PlayerRequest playerRequest) {
        log.info("ActionLog.info.addPlayer method");
        PlayerEntity playerEntity = PlayerMapper.INSTANCE.requestToEntity(playerRequest);
        return playerRepository.save(playerEntity);
    }

    public List<PlayerDto> getAllPlayers() {
        log.info("ActionLog.info.getAllPlayers method");
        return PlayerMapper.INSTANCE.entityToDtoList(playerRepository.findAll());
    }

    public PlayerDto findById(Integer id) {
        PlayerDto playerDto = PlayerMapper.INSTANCE.entityToDto(playerRepository.findById(id).orElseThrow(()->{
            log.error("ActionLog.error.findById entered id: {} does not exist",id);
            throw new PlayerException("This id does not exist!");

                }
                ));
        return playerDto;
    }
}
*/
