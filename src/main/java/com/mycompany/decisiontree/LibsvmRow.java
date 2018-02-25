/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decisiontree;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public class LibsvmRow {

    private LibsvmLabel label;

    private Map features = new HashMap<LibsvmFeature, Double>();

    private MaxentTagger tagger = new MaxentTagger("data/taggers/english-bidirectional-distsim.tagger");

    public LibsvmRow(String inputString, LibsvmLabel expectedLabel) {
        this.label = expectedLabel;
        this.parseString(inputString);
        int a = 3;
    }

    private void parseString(String inpuString) {
        this.insertFeature(LibsvmFeature.LENGTH, inpuString.length());
        String processedString = this.tagger.tagString(inpuString);
        String[] words = processedString.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            String partOfSpeech = this.extractPartOfSpeech(words[i]);
            if (LibsvmFeature.contains(partOfSpeech)) {
                LibsvmFeature feature = LibsvmFeature.valueOf(partOfSpeech);
                if (this.features.get(feature) == null) {
                    int counter = 0;
                    for (int j = i; j < words.length; j++) {
                        String word = this.extractPartOfSpeech(words[j]);
                        if (partOfSpeech.equals(word)) {
                            counter++;
                        }
                    }
                    this.features.put(feature, Math.round(100.0 * (1.0 * counter / words.length)));
                }
            }
        }
        int a = 4;
    }

    private String extractPartOfSpeech(String inputString) {
        String[] parts = inputString.split("_");
        if (parts.length > 0) {
            return parts[parts.length - 1];
        }
        return "";
    }

    private void insertFeature(LibsvmFeature feature, double value) {
        if (this.features.get(feature) != null) {
            this.features.replace(feature, value);
        } else {
            this.features.put(feature, value);
        }
    }

}
