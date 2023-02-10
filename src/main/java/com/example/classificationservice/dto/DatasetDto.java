package com.example.classificationservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import weka.core.Attribute;
import weka.core.Instances;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DatasetDto {
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "attributeName")
    private ArrayList<Attribute> attributeName;
    @JsonProperty(value = "capacity")
    private int capacity;
}
