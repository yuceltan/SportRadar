package com.yuceltanebiri.sportradar.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yuceltanebiri.sportradar.model.Input;
import com.yuceltanebiri.sportradar.model.Output;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SportRadarServiceTest {

    @Test
    void calculateMostProbableResult() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Object input = objectMapper.readValue(
                new ClassPathResource("data.json").getFile(), Input.class);
        SportRadarService sportRadarService = new SportRadarService();
        Output output = sportRadarService.calculateMostProbableResult(input, 10L);

        assertEquals(10, output.getResults().size());
        assertEquals("DRAW (88.1)", output.getResults().get(0).getHighestProbableResult());
    }
}