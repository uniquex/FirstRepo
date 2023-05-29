/*
package com.example.liquibase.Controller

import com.example.liquibase.Entity.PlayerEntity
import com.example.liquibase.Exception.PlayerException
import com.example.liquibase.Model.Dto.PlayerDto
import com.example.liquibase.Service.PlayerService
import org.skyscreamer.jsonassert.JSONAssert
import org.skyscreamer.jsonassert.JSONCompareMode
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.bind.annotation.ResponseStatus
import spock.lang.Specification


class PlayerControllerTest extends Specification {
    MockMvc mockMvc;
    private PlayerService playerService;

    void setup() {
        playerService = Mock()
        def playerController = new PlayerController(playerService)
        mockMvc = MockMvcBuilders.standaloneSetup(playerController)
                .setControllerAdvice(new ExcHandler())
                .build()
    }

    def "GetPlayers 200"() {
        given:
        def url = "/player"

        def dto = [PlayerEntity.builder()
                           .name("hasan")
                           .salary(1500)
                           .build(),
                   PlayerEntity.builder()
                           .name("Javad")
                           .salary(600)
                           .build()]
        def dtoJSON = '''[{
                                "name":"hasan",
                                "salary":1500
                                    },{
                                    "name":"Javad",
                                    "salary":600
                                    }
                                    ]'''


        when:
        def result = mockMvc
                .perform(MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn().response

        then:
        1 * playerService.getAllPlayers() >> dto

        result.status == 200
        JSONAssert.assertEquals(dtoJSON,result.contentAsString,false)

    }

    def "GetPlayers empty 200"(){

        given:
        def url = "/player"
        def dtoJSON = '''[]'''

        when:
        def result = mockMvc.perform(MockMvcRequestBuilders.get(url)
                .contentType(MediaType.APPLICATION_JSON)).andReturn().response

        then:
        1 * playerService.getAllPlayers() >> new ArrayList<PlayerEntity>()

        result.status == HttpStatus.OK.value()
        JSONAssert.assertEquals(dtoJSON,result.contentAsString,false)

    }

    def "GetPlayer 200"() {
        given:
        def id = 1;
        def url = "/player/$id"

        def playerDto = new PlayerDto("hasan", 2000)

        def responseJson = '''
                {
                "name":"hasan",
                "salary":2000          
                }
            '''

        when:
        def res = mockMvc
                .perform(MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn().response

        then:
        1 * playerService.findById(id) >> playerDto

        res.status == 200
        JSONAssert.assertEquals(responseJson, res.contentAsString, false)
    }

    def "GetPlayer 404"() {
        given:
        def id = 1
        def url = "/player/$id"

        when:
        def res = mockMvc
                .perform(MockMvcRequestBuilders.get(url)
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn().response
        then:
        1 * playerService.findById(id) >> {
            throw new PlayerException("This id does not exist!")
        }

        res.status == HttpStatus.NOT_FOUND.value()
        res.contentAsString == '''{"ErrorMessage":"This id does not exist!"}'''
    }




}
*/
