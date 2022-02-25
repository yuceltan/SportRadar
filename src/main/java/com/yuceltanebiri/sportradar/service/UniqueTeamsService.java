package com.yuceltanebiri.sportradar.service;

import com.yuceltanebiri.sportradar.model.Competitor;
import com.yuceltanebiri.sportradar.model.Event;
import com.yuceltanebiri.sportradar.model.Input;
import com.yuceltanebiri.sportradar.model.UniqueTeamsNamesOutput;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class UniqueTeamsService {

    public UniqueTeamsNamesOutput printUniqueTeamsAlphabetically(Input input) {
        Set<String> uniqueTeamsList = input.getEvents().stream().map(Event::getCompetitors).flatMap(List::stream).map(Competitors::getName).sorted().collect(Collectors.toCollection(TreeSet::new));
        UniqueTeamsNamesOutput output = new UniqueTeamsNamesOutput();
        output.setUNIQUETEAMS(uniqueTeamsList);
        return output;
    }
}
