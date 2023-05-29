/*
package com.example.liquibase.Service

import com.example.liquibase.Entity.PlayerEntity
import com.example.liquibase.Model.Mapper.PlayerMapper
import com.example.liquibase.Model.Request.PlayerRequest
import com.example.liquibase.Repository.PlayerRepository
import spock.lang.Specification

class PlayerServiceTest extends Specification {
    private PlayerRepository playerRepository
    private PlayerService playerService

    void setup() {
        playerRepository = Mock()
        playerService = new PlayerService(playerRepository)
    }

    def "GetPlayer success"() {
        given:
        def id = 1
        def entity = PlayerEntity.builder()
                .name("Emil")
                .salary(4000)
                .build()

        when:
        def dto = playerService.findById(id)

        then:
        1 * playerRepository.findById(id) >> Optional.of(entity)

        dto.name == entity.name
        dto.salary == entity.salary

    }

    def "GetPlayers success"(){
        given:
        def entity = [
                PlayerEntity.builder()
                .name("Hasan")
                .salary(1300)
                .build(),
                PlayerEntity.builder()
                .name("Vafa")
                .salary(500)
                .build()
        ]

        when:
        def dto = playerService.getAllPlayers()

        then:
        1 * playerRepository.findAll() >> entity

        dto[0].name == entity[0].name
        dto[0].salary == entity[0].salary
        dto[1].name == entity[1].name
        dto[1].salary == entity[1].salary
    }

    def "AddPlayer success"(){

        given:
        def dto = PlayerRequest.builder()
        .name("hasan")
        .salary(1600)
        .build()

        when:
        def result = playerService.addPlayer(dto)

        then:
        1 * playerRepository.save(PlayerMapper.INSTANCE.requestToEntity(dto))
    }


}
*/
