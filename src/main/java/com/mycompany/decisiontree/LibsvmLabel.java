/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decisiontree;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public enum LibsvmLabel {
    ARTICLE_NAME(0),
    ARTCILE_AUTHORS(1),
    ARTICLE_ABSTRACT(2),
    ARTICLE_KEYWORDS(3);
    
    private int value;
    private static Map map = new HashMap<>();

    private LibsvmLabel(int value) {
        this.value = value;
    }

    static {
        for (LibsvmLabel label : LibsvmLabel.values()) {
            map.put(label.value, label);
        }
    }

    public static LibsvmLabel valueOf(int label) {
        return (LibsvmLabel) map.get(label);
    }

    public int getValue() {
        return value;
    }
    
}
