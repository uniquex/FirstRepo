package com.example.liquibase.Service2

import com.example.liquibase.Entity2.TaxiEntity
import com.example.liquibase.Repository2.TaxiRepository
import io.github.benas.randombeans.EnhancedRandomBuilder
import spock.lang.Specification

class TaxiServiceTest extends Specification {

    private Random random = EnhancedRandomBuilder.aNewEnhancedRandom()
    private TaxiService taxiService
    private TaxiRepository taxiRepository

    void setup(){
        taxiRepository=Mock()
        taxiService = new TaxiService(taxiRepository)
    }

    def "getTaxi success"(){
        given:
        def id =100
        def entity = random.nextObject(TaxiEntity)

        when:
        def dto = taxiService.getTaxi(id)

        then:
        1 * taxiRepository.findById(id) >> Optional.of(entity)

        entity.driverName == dto.driverName
    }

    def "getTaxi failed"(){
        given:
        def id = 100
        def entity = random.nextObject(TaxiEntity)

        when:
        def dto = taxiService.getTaxi(id)

        then:
        1 * taxiRepository.findById(id) >> Optional.empty()

        def f = thrown(TaxiNotFoundException)

        f.getMessage() == "THAT_ID_DOES_NOT_EXIST!"
    }
}
