package com.example.liquibase.Controller2;

import com.example.liquibase.Entity2.TaxiEntity;
import com.example.liquibase.Model.Dto2.TaxiDto;
import com.example.liquibase.Model.Request2.TaxiRequest;
import com.example.liquibase.Service2.TaxiService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/taxis")
public class TaxiController {
    private TaxiService taxiService;

    public TaxiController(TaxiService taxiService) {
        this.taxiService = taxiService;
    }

    @GetMapping
    @PreAuthorize("@permissionService.hasPermission('ROLE_ECONOM')")
    public List<TaxiDto> getAllTaxis(){
        return taxiService.getAllTaxis();
    }


    @GetMapping("/{id}")
    public TaxiDto getTaxi(@PathVariable Integer id){
        return taxiService.getTaxi(id);
    }


    @PostMapping
    public TaxiEntity addTaxi(@RequestBody TaxiRequest taxiRequest){
        return taxiService.addTaxi(taxiRequest);
    }


    @DeleteMapping("/{id}")
    public String deleteTaxi(@PathVariable Integer id){
        return taxiService.deleteTaxi(id);
    }
}

