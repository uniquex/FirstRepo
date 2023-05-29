/*
package com.example.liquibase.Controller;

import com.example.liquibase.Entity.ClubEntity;
import com.example.liquibase.Model.Dto.ClubDto;
import com.example.liquibase.Model.Request.ClubRequest;
import com.example.liquibase.Service.ClubService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/club")
public class ClubController {

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    private ClubService clubService;

    @PostMapping("/add")
    public ClubEntity addClub(@RequestBody @Valid ClubRequest clubRequest){
        return clubService.addClub(clubRequest);
    }

    @GetMapping
    public List<ClubDto> getAllClubs(){
        return clubService.getAllClubs();
    }

    @GetMapping("/{id}")
    public ClubDto getClubById(@PathVariable Integer id){
        return clubService.getClubById(id);
    }
}
*/
