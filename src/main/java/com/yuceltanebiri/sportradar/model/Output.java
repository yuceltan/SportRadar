
package com.yuceltanebiri.sportradar.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "OUTPUT"
})

public class Output {

    @JsonProperty("OUTPUT")
    private ArrayList<Result> OUTPUT = null;

    @JsonProperty("OUTPUT")
    public ArrayList<Result> getOUTPUT() {
        return OUTPUT;
    }

    @JsonProperty("OUTPUT")
    public void setOUTPUT(ArrayList<Result> OUTPUT) {
        this.OUTPUT = OUTPUT;
    }

}
