package com.example.classificationservice.controller;


import com.example.classificationservice.dto.DatasetDto;
import com.example.classificationservice.dto.OptionsDto;
import com.example.classificationservice.enums.Algorithms;
import com.example.classificationservice.services.AlgorithmsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlgorithmsController {
    @Autowired
    private AlgorithmsServices algorithmServices;


    @GetMapping("/algorithms")
    public List<String> getAll() {

        return algorithmServices.getAlgorithms();
    }

    @PostMapping("/model")
    public void createModel(@RequestBody OptionsDto optionsDto, @RequestBody Algorithms algorithms, @RequestBody DatasetDto datasetDto) throws Exception {
        algorithmServices.putModel(optionsDto, algorithms, datasetDto);
    }
}
