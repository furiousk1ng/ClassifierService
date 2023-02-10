package com.example.classificationservice.classifiers;

import com.example.classificationservice.dto.DatasetDto;
import com.example.classificationservice.dto.OptionsDto;
import com.example.classificationservice.enums.Options;
import com.example.classificationservice.interfaces.Model;
import weka.classifiers.trees.J48;
import weka.core.Instances;

import java.util.ArrayList;


public class J48Impl implements Model {

    private J48 j48;


    public J48Impl(OptionsDto option) throws Exception {
        this.j48 = new J48();
        this.j48.setOptions(option.toArray(new String[option.size()]));


    }

    public void train(DatasetDto datasetDto) throws Exception {

        Instances inst = new Instances(datasetDto.getName(), datasetDto.getAttributeName(), datasetDto.getCapacity());
        j48.buildClassifier(inst);

    }


}
