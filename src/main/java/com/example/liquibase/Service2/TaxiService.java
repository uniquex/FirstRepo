package com.example.liquibase.Service2;

import com.example.liquibase.Entity2.TaxiEntity;
import com.example.liquibase.Model.Dto2.TaxiDto;
import com.example.liquibase.Model.Mapper2.TaxiMapper;
import com.example.liquibase.Model.Request2.TaxiRequest;
import com.example.liquibase.Repository2.TaxiRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TaxiService {
    private TaxiRepository taxiRepository;

    public TaxiService(TaxiRepository taxiRepository) {
        this.taxiRepository = taxiRepository;
    }

    public List<TaxiDto> getAllTaxis() {
        return TaxiMapper.INSTANCE.entityToDtoList(taxiRepository.findAll());
    }
    public TaxiDto getTaxi(Integer id) {
        return TaxiMapper.INSTANCE.entityToDto(taxiRepository.findById(id).orElseThrow(
                ()->{
                    throw new TaxiNotFoundException("THAT_ID_DOES_NOT_EXIST!");
                }));
    }
    public TaxiEntity addTaxi(TaxiRequest taxiRequest) {
        TaxiEntity newTaxi = TaxiMapper.INSTANCE.requestToEntity(taxiRequest);
        taxiRepository.save(newTaxi);
        return newTaxi;
    }
    public String deleteTaxi(Integer id) {
        taxiRepository.deleteById(id);
        return "TAXI_WAS_DELETED_SUCCESFULLY!";
    }

}
