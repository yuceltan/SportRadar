
package com.yuceltanebiri.sportradar.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.*;
import java.util.*;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sport_event_id",
    "start_date",
    "sport_name",
    "competition_name",
    "competition_id",
    "season_name",
    "competitors",
    "venue",
    "probability_home_team_winner",
    "probability_draw",
    "probability_away_team_winner"
})

public class Event {

    @JsonProperty("sport_event_id")
    private String sport_event_id ;
    @JsonProperty("start_date")
    private String start_date;
    @JsonProperty("sport_name")
    private String sport_name;
    @JsonProperty("competition_name")
    private String competition_name;
    @JsonProperty("competition_id")
    private String competition_id;
    @JsonProperty("season_name")
    private String season_name;
    @JsonProperty("competitors")
    private ArrayList<Competitors> competitors = null;
    @JsonProperty("venue")
    private Venue venue;
    @JsonProperty("probability_home_team_winner")
    private double probability_home_team_winner;
    @JsonProperty("probability_draw")
    private double probability_draw;
    @JsonProperty("probability_away_team_winner")
    private double probability_away_team_winner;
    
    public Event(){ //constructor
        super();
       }
    public Event(String sport_event_id,String start_date,String sport_name,String competition_name,String competition_id,String season_name,ArrayList<Competitors> competitors,Venue venue,double probability_home_team_winner,double probability_draw,double probability_away_team_winner){

        this.sport_event_id=sport_event_id;
        this.start_date=start_date;
        this.sport_name=sport_name;
        this.competition_name=competition_name;
        this.competition_id=competition_id;
        this.season_name=season_name;
        this.competitors=competitors;
        this.venue=venue;
        this.probability_home_team_winner=probability_home_team_winner;
        this.probability_draw=probability_draw;
        this.probability_away_team_winner=probability_away_team_winner;

    }

    @JsonProperty("sport_event_id")
    public String getSport_event_id(){
        return this.sport_event_id;
    
    }

    @JsonProperty("sport_event_id")
    public void setSport_event_id(String sport_event_id){
        this.sport_event_id=sport_event_id;
    }

    @JsonProperty("start_date")
    public String getStart_date(){
        return this.start_date;
    }

    @JsonProperty("start_date")
    public void setStart_date(String start_date){
        this.start_date=start_date;
    }

    @JsonProperty("sport_name")
    public String getSport_name(){
        return this.sport_name;
    }

    @JsonProperty("sport_name")
    public void setSport_name(String sport_name){
        this.sport_name=sport_name;
    }

    @JsonProperty("competition_name")
    public String getCompetition_name(){
        return this.competition_name;
    }

    @JsonProperty("competition_name")
    public void setCompetition_name(String competition_name){
        this.competition_name=competition_name;
    }

    @JsonProperty("competition_id")
    public String getCompetition_id(){
        return this.competition_id;
    }

    @JsonProperty("competition_id")
    public void setCompetition_id(String competition_id){
        this.competition_id=competition_id;
    }

    @JsonProperty("season_name")
    public String getSeason_name(){
        return this.season_name;
    }

    @JsonProperty("season_name")
    public void setSeason_name(){
        this.season_name=season_name;
    }

    @JsonProperty("competitors")
    public ArrayList<Competitors> getCompetitors(){
        return this.competitors=competitors;
    }

    @JsonProperty("competitors")
    public void setCompetitors(){
        this.competitors=competitors;
    }

    @JsonProperty("venue")
    public Venue getVenue(){
        return this.venue=venue;
    }

    @JsonProperty("venue")
    public void setVenue(Venue venue){
        this.venue = venue;
    }

    @JsonProperty("probability_home_team_winner")
    public double getProbability_home_team_winner(){
        return this.probability_home_team_winner;
    }

    @JsonProperty("probability_home_team_winner")
    public void setProbability_home_team_winner(){
        this.probability_home_team_winner=probability_home_team_winner;
    }

    @JsonProperty("probability_draw")
    public double getProbability_draw(){
        return this.probability_draw;
    }

    @JsonProperty("probability_draw")
    public void setProbability_draw(){
        this.probability_draw=probability_draw;
    }

    @JsonProperty("probability_away_team_winner")
    public double getProbability_away_team_winner(){
        return this.probability_away_team_winner;
    }

    @JsonProperty("probability_away_team_winner")
    public void setProbability_away_team_winner(){
        this.probability_away_team_winner=probability_away_team_winner;
    }

}
