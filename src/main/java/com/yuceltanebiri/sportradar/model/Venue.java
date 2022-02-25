
package com.yuceltanebiri.sportradar.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "capacity",
    "city_name",
    "country_name",
    "map_coordinates",
    "country_code"
})

public class Venue {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("capacity")
    private int capacity;
    @JsonProperty("city_name")
    private String city_name;
    @JsonProperty("country_name")
    private String country_name;
    @JsonProperty("map_coordinates")
    private String map_coordinates;
    @JsonProperty("country_code")
    private String country_code;
    
    public Venue(){
        super();
       }
    
    public Venue(String id,String name,int capacity,String city_name,String country_name,String map_coordinates,String country_code)
    {
        this.id=id;
        this.name=name;
        this.capacity=capacity;
        this.city_name=city_name;
        this.country_name=country_name;
        this.map_coordinates=map_coordinates;
        this.country_code=country_code;
        
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

    @JsonProperty("capacity")
    public int getCapacity(){
        return this.capacity;
    }

    @JsonProperty("capacity")
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @JsonProperty("city_name")
    public String getCity_name(){
        return this.city_name;
    }

    @JsonProperty("city_name")
    public void setCity_name(String city_name){
        this.city_name=city_name;
    }

    @JsonProperty("country_name")
    public String getCountry_name(){
        return this.country_name;
    }

    @JsonProperty("country_name")
    public void setCountry_name(String country_name){
        this.country_name=country_name;
    }
    
    @JsonProperty("map_coordinates")
    public String getMap_coordinates(){
        return this.map_coordinates;
    }

    @JsonProperty("map_coordinates")
    public void setMap_coordinates(String map_coordinates){
        this.map_coordinates=map_coordinates;
    }

    @JsonProperty("country_code")
    public String getCountry_code(){
        return this.country_code ;
    }

    @JsonProperty("country_code")
    public void setCountry_code(String country_code){
        this.country_code=country_code;
    }

}
