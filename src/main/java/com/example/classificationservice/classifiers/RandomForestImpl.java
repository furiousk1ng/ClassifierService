package com.example.classificationservice.classifiers;

import com.example.classificationservice.dto.DatasetDto;
import com.example.classificationservice.dto.OptionsDto;
import com.example.classificationservice.interfaces.Model;
import weka.classifiers.trees.RandomForest;
import weka.core.Instances;

public class RandomForestImpl implements Model {
    private RandomForest randomForest;

    public RandomForestImpl(OptionsDto option) throws Exception {
        this.randomForest = new RandomForest();
        this.randomForest.setOptions(option.toArray(new String[option.size()]));

    }

    @Override
    public void train(DatasetDto datasetDto) throws Exception {
        Instances inst = new Instances(datasetDto.getName(), datasetDto.getAttributeName(), datasetDto.getCapacity());
        randomForest.buildClassifier(inst);
    }
}
