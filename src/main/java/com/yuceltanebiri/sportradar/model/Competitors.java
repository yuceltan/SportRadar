
package com.yuceltanebiri.sportradar.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "country",
    "country_code",
    "abbreviation",
    "qualifier",
    "gender"
})

public class Competitors {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_code")
    private String country_code;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("qualifier")
    private String qualifier;
    @JsonProperty("gender")
    private String gender;
    
    public Competitors(){
        super();
       }
    public Competitors(String id,String name,String country,String country_code,String abbreviation,String qualifier,String gender)
    {
     this.id =id;
     this.name=name;
     this.country=country;
     this.country_code=country_code;
     this.abbreviation=abbreviation;
     this.qualifier=qualifier;
     this.gender=gender;
    }

    @JsonProperty("id")
    public String getId(){
        return this.id;
    }

    @JsonProperty("id")
    public void setId(String id){
        this.id=id;
    }

    @JsonProperty("name")
    public String getName(){
        return this.name;
    }

    @JsonProperty("name")
    public void setName(String name){
        this.name=name;
    }

    @JsonProperty("country")
    public String getCountry() {
        return this.country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return this.country_code;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.country_code = country_code;
    }

    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return this.abbreviation;
    }

    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @JsonProperty("qualifier")
    public String getQualifier() {
        return this.qualifier;
    }

    @JsonProperty("qualifier")
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    @JsonProperty("gender")
    public String getGender() {
        return this.gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

}
