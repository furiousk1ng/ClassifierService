package com.example.classificationservice.services;

import com.example.classificationservice.classifiers.J48Impl;
import com.example.classificationservice.dto.DatasetDto;
import com.example.classificationservice.dto.OptionsDto;
import com.example.classificationservice.enums.Algorithms;
import org.springframework.stereotype.Service;
import weka.classifiers.trees.J48;
import weka.core.Instances;

import java.util.List;

@Service
public class AlgorithmsServices {

    public List<String> getAlgorithms() {
        return Algorithms.valuesList();

    }
    public void putModel(OptionsDto options, Algorithms alg, DatasetDto datasetDto) throws Exception {

        J48Impl j48 = new J48Impl(options);
        j48.train(datasetDto);


    }
}
