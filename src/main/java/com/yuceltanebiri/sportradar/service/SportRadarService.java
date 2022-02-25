package com.yuceltanebiri.sportradar.service;

import com.yuceltanebiri.sportradar.model.Event;
import com.yuceltanebiri.sportradar.model.Input;
import com.yuceltanebiri.sportradar.model.Output;
import com.yuceltanebiri.sportradar.model.Result;
import org.yuceltanebiri.stereotype.Service; // ERROR

import java.util.*;
import java.util.stream.Collectors;


@org.springframework.stereotype.Service
public class SportRadarService {

    /*public Output calculateMostProbableResult(Input input, Long size) {
        List<Event> events = input.getEvents().stream()
                .sorted(Comparator.comparingDouble(this::getHighestProbabilityValue).reversed()) // ERROR
                .limit(size)
                .collect(Collectors.toList());*/


       // return createOutput(events);
   // }

    /*private double getHighestProbabilityValue(Event event) {
        float highestProbability = event.getProbability_home_team_winner() > event.getProbability_away_team_winner()
                ? event.getProbabilityHomeTeamWinner() : event.getProbability_away_team_winner();*/ //ERROR
    
    

        if (event.getProbabilityDraw() > highestProbability)
            highestProbability = event.getProbabilityDraw();

        return highestProbability;
    }

  
    }

    private Result createResult(Event event) {
        Result result = new Result();
        if (event.getStart_date() != null)
            result.setStart_date(event.getStart_date());
        else result.setStart_date("Missing Start Date");
        if (event.getCompetitors() != null)
            result.setMatch(createMatchName(event));
        else result.setMatch("Missing competitors information");
        if (event.getVenue() != null)
            result.setVenue(event.getVenue().getName());
        else result.setVenue("Missing venue information");
        result.setHighest_probable_result(createHighestProbableResult(event));

        return result;
    }


	private String createHighestProbableResult(Event event) {
		// TODO Auto-generated method stub
		return null;
	}


	private String createMatchName(Event event) {
		// TODO Auto-generated method stub
		return null;
	}


	public Output calculateMostProbableResult(Input input, Long size) {
		// TODO Auto-generated method stub
		return null;
	}

    
    }

    /*private String createHighestProbableResult(Event event) {
        String resultName = "HOME_TEAM_WIN";
        float probability = event.getProbabilityHomeTeamWinner();
        if (event.getProbabilityAwayTeamWinner() > probability) {
            resultName = "AWAY_TEAM_WIN";
            probability = event.getProbabilityAwayTeamWinner();
        }
        if (event.getProbabilityDraw() > probability) {
            resultName = "DRAW";
            probability = event.getProbabilityDraw();
        }

        return resultName + " (" + probability + ")";*/ //ERROR
    }
}
