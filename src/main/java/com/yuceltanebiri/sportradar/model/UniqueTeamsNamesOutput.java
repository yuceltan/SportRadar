
package com.yuceltanebiri.sportradar.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "UNIQUETEAMS"
})

public class UniqueTeamsNamesOutput {

    @JsonProperty("UNIQUETEAMS")
    private Set<String> UNIQUETEAMS = null;

    @JsonProperty("UNIQUETEAMS")
    public Set<String> getUNIQUETEAMS() {
        return UNIQUETEAMS;
    }

    @JsonProperty("UNIQUETEAMS")
    public void setUNIQUETEAMS(Set<String> UNIQUETEAMS) {
        this.UNIQUETEAMS = UNIQUETEAMS;
    }

}
