package com.yuceltanebiri.sportradar.controller;

import com.yuceltanebiri.sportradar.model.Input;
import com.yuceltanebiri.sportradar.model.Output;
import com.yuceltanebiri.sportradar.model.UniqueTeamsNamesOutput;
import com.yuceltanebiri.sportradar.service.SportRadarService;
import com.yuceltanebiri.sportradar.service.UniqueTeamsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SportRadarController {

    public SportRadarController(SportRadarService sportRadarService, UniqueTeamsService uniqueTeamsService) {
        this.sportRadarService = sportRadarService;
        this.uniqueTeamsService = uniqueTeamsService;
    }

    SportRadarService sportRadarService;
    UniqueTeamsService uniqueTeamsService;

    @PostMapping("sportRadar")
    public Output calculateResult(@RequestBody Input input, @RequestParam(defaultValue = "10") Long size) {
        try {
            return sportRadarService.calculateMostProbableResult(input, size);
        } catch (Exception exception) {
            System.out.println(exception.getStackTrace());
            return new Output();
        }
    }

    @PostMapping("uniqueTeams")
    public UniqueTeamsNamesOutput printUniqueTeamsAplhabetically(@RequestBody Input input) {
        try {
            return uniqueTeamsService.printUniqueTeamsAlphabetically(input);
        } catch (Exception exception) {
            System.out.println(exception.getStackTrace());
            return new UniqueTeamsNamesOutput();
        }
    }

}


