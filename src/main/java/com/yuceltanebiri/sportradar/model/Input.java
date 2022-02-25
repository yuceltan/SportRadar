
package com.yuceltanebiri.sportradar.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.genereted;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "INPUT"
})

public class Input {

    @JsonProperty("INPUT")
    private ArrayList<Event> INPUT = null;

    @JsonProperty("INPUT")
    public ArrayList<Event> getEvents() {
        return INPUT;
    }

    @JsonProperty("Events")
    public void setEvents(ArrayList<Event> INPUT) {
        this.INPUT = INPUT;
    }

}
