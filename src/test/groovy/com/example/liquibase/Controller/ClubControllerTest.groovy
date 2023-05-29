/*
package com.example.liquibase.Controller

import com.example.liquibase.Entity.ClubEntity
import com.example.liquibase.Entity.PlayerEntity
import com.example.liquibase.Exception.ClubException
import com.example.liquibase.Model.Dto.ClubDto
import com.example.liquibase.Service.ClubService
import org.skyscreamer.jsonassert.JSONAssert
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification

class ClubControllerTest extends Specification {

    MockMvc mockMvc;
    private ClubService clubService;

    void setup() {
        clubService = Mock()
        def clubController = new ClubController(clubService)
        mockMvc = MockMvcBuilders.standaloneSetup(clubController)
                .setControllerAdvice(new ExcHandler())
                .build()
    }

    def "GetClubs 200"() {

        given:
        def url = "/club"

        def dto = [ClubEntity.builder()
                           .name("barcelona")
                           .trophies(45)
                           .build(),
                   ClubEntity.builder()
                           .name("real madrid")
                           .trophies(43)
                           .build()]

        def dtoJSON = '''[{
                            "name":"barcelona",
                            "trophies":45
                                },                           
                               {
                               "name":"real madrid",
                               "trophies": 43
                                }]'''
        when:
        def result = mockMvc.perform(MockMvcRequestBuilders.get(url)
                .contentType(MediaType.APPLICATION_JSON))
                .andReturn().response

        then:
        1 * clubService.getAllClubs() >> dto

        result.status == 200
        JSONAssert.assertEquals(dtoJSON, result.contentAsString, false)
    }

    def "GetClubs empty 200"() {
        given:
        def url = "/club"
        def dtoJSON = '''[]'''

        when:
        def result = mockMvc.perform(MockMvcRequestBuilders.get(url)
                .contentType(MediaType.APPLICATION_JSON))
                .andReturn().response


        then:
        1 * clubService.getAllClubs() >> new ArrayList<ClubEntity>()

        result.status == 200
        JSONAssert.assertEquals(dtoJSON, result.contentAsString, false)
    }

    def "GetClub 200"() {
        given:
        def id = 1
        def url = "/club/$id"

        def dto = new ClubDto("barcelona", 45)

        def dtoJSON = '''{
                                "name":"barcelona",
                                "trophies":45
                                }'''

        when:
        def result = mockMvc.perform(MockMvcRequestBuilders.get(url)
                .contentType(MediaType.APPLICATION_JSON))
                .andReturn().response

        then:
        1 * clubService.getClubById(id) >> dto

        result.status == 200
        JSONAssert.assertEquals(dtoJSON, result.contentAsString, false)
    }

    def "GetClub 400"() {
        given:
        def id = 1
        def url = "/club/$id"


        when:
        def result = mockMvc.perform(MockMvcRequestBuilders.get(url)
                .contentType(MediaType.APPLICATION_JSON))
                .andReturn().response

        then:
        1 * clubService.getClubById(id) >> {
            throw new ClubException("this id does not exist")
        }

        result.status == HttpStatus.BAD_REQUEST.value()
        result.contentAsString =='''{"ErrorMessage":"this id does not exist"}'''
    }
}
*/
