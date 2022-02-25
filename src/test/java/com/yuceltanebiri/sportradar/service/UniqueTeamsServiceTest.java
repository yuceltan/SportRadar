package com.yuceltanebiri.sportradar.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yuceltanebiri.sportradar.model.Input;
import com.yuceltanebiri.sportradar.model.UniqueTeamsNamesOutput;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueTeamsServiceTest {

    @Test
    void printUniqueTeamsAlphabetically() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Input input = objectMapper.readValue(
                new ClassPathResource("data.json").getFile(), Input.class);
        UniqueTeamsService uniqueTeamsService = new UniqueTeamsService();
        UniqueTeamsNamesOutput output = uniqueTeamsService.printUniqueTeamsAlphabetically(input);

        assertEquals(52, output.getUniqueNames().size());
    }

}