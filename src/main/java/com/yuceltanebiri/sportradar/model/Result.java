
package com.yuceltanebiri.sportradar.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "start_date",
        "match",
        "venue",
        "highest_probable_result"
})

public class Result {

    @JsonProperty("start_date")
    private String start_date;
    @JsonProperty("match")
    private String match;
    @JsonProperty("venue")
    private String venue;
    @JsonProperty("highest_probable_result")
    private String highest_probable_result;

    @JsonProperty("start_date")
    public String getStart_date() {
        return start_date;
    }

    @JsonProperty("start_date")
    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    @JsonProperty("match")
    public String getMatch() {
        return match;
    }

    @JsonProperty("match")
    public void setMatch(String match) {
        this.match = match;
    }

    @JsonProperty("venue")
    public String getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(String venue) {
        this.venue = venue;
    }

    @JsonProperty("highest_probable_result")
    public String getHighest_probable_result() {
        return highest_probable_result;
    }

    @JsonProperty("highest_probable_result")
    public void setHighest_probable_result(String highest_probable_result) {
        this.highest_probable_result = highest_probable_result;
    }

}
