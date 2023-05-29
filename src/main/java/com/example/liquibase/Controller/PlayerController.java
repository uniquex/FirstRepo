/*
package com.example.liquibase.Controller;

import com.example.liquibase.Entity.PlayerEntity;
import com.example.liquibase.Model.Dto.PlayerDto;
import com.example.liquibase.Model.Request.PlayerRequest;
import com.example.liquibase.Service.PlayerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.ACCEPTED;

@RestController
@RequestMapping("/player")

public class PlayerController {


    private PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping("/add")
    public PlayerEntity addPlayer(@RequestBody @Valid PlayerRequest playerRequest){
       return playerService.addPlayer(playerRequest);
    }
    @GetMapping
    public List<PlayerDto> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @GetMapping("/{id}")
    public PlayerDto getPlayerById(@PathVariable Integer id){
        return playerService.findById(id);
    }
}
*/
