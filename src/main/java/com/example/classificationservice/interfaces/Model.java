package com.example.classificationservice.interfaces;

import com.example.classificationservice.dto.DatasetDto;
import weka.core.Instances;

public interface Model {
    void train(DatasetDto datasetDto) throws Exception;
}
