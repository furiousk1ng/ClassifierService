package com.example.classificationservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OptionsDto {
    @JsonProperty(value = "flags")
    private ArrayList<String> option;


    public String[] toArray(String[] strings) {
        return strings;
    }
}
