/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decisiontree;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;


/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        System.setProperty("hadoop.home.dir", "E:\\DATA(G)\\workspace\\DecisionTree");
        LibsvmRow row = new LibsvmRow("Matov", LibsvmLabel.ARTICLE_NAME);
        LibsvmRow row1 = new LibsvmRow("64-74", LibsvmLabel.ARTICLE_NAME);
        LibsvmRow row2 = new LibsvmRow("width=\"25px\" alt=\"\">PDF,DOC", LibsvmLabel.ARTICLE_NAME);
        LibsvmRow row3 = new LibsvmRow("Generalized Noise Combating Codes in the Tasks of Providing Integrity of Information Hold-ing Objects in the Conditions of Natural Factors Influence", LibsvmLabel.ARTICLE_NAME);
        LibsvmRow row4 = new LibsvmRow("Mаtоv О.Ya., Vаsylenko V.S.", LibsvmLabel.ARTICLE_NAME);
        LibsvmRow row5 = new LibsvmRow("Generalized noise combating codes for the use in the tasks of providing integrity of information holding objects in the conditions of natural factors influence are proposed. Fig.: 3. Refs.: 4 titles.", LibsvmLabel.ARTICLE_NAME);
//        SparkSession spark = SparkSession
//            .builder()
//            .appName("Main")
//            .config("spark.master", "local")
//            .getOrCreate();
//        
//        // Load and parse the data file, converting it to a DataFrame.
//        Dataset<Row> data = spark.read().format("libsvm").load("data/mllib/sample_libsvm_data.txt");
//        
//        // Index labels, adding metadata to the label column.
//        // Fit on whole dataset to include all labels in index.
//        StringIndexerModel labelIndexer = new StringIndexer()
//          .setInputCol("label")
//          .setOutputCol("indexedLabel")
//          .fit(data);
//        // Automatically identify categorical features, and index them.
//        // Set maxCategories so features with > 4 distinct values are treated as continuous.
//        VectorIndexerModel featureIndexer = new VectorIndexer()
//          .setInputCol("features")
//          .setOutputCol("indexedFeatures")
//          .setMaxCategories(4)
//          .fit(data);
//
//        // Split the data into training and test sets (30% held out for testing)
//        Dataset<Row>[] splits = data.randomSplit(new double[] {0.7, 0.3});
//        Dataset<Row> trainingData = splits[0];
//        Dataset<Row> testData = splits[1];
//
//        // Train a RandomForest model.
//        RandomForestClassifier rf = new RandomForestClassifier()
//          .setLabelCol("indexedLabel")
//          .setFeaturesCol("indexedFeatures");
//
//        // Convert indexed labels back to original labels.
//        IndexToString labelConverter = new IndexToString()
//          .setInputCol("prediction")
//          .setOutputCol("predictedLabel")
//          .setLabels(labelIndexer.labels());
//
//        // Chain indexers and forest in a Pipeline
//        Pipeline pipeline = new Pipeline()
//          .setStages(new PipelineStage[] {labelIndexer, featureIndexer, rf, labelConverter});
//
//        // Train model. This also runs the indexers.
//        PipelineModel model = pipeline.fit(trainingData);
//
//        // Make predictions.
//        Dataset<Row> predictions = model.transform(testData);
//        
//        predictions.show();
        
        System.err.println("Test test11111");
    }

}
