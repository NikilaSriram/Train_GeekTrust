package com.example.geektrust;

import java.util.ArrayList;
import java.util.List;

public class TrainService {
    private static int[] bogieLength = new int[1];
    public static List<String> allBogies = new ArrayList<>();

 
    public static void createTrain(String trainName, String[] bogies) {
        TrainBuilder t = new TrainBuilder(trainName, bogies);
        List<String> bogiesFromHyd = t.BogiesToHYB(trainName, bogies);
        allBogies.addAll(bogiesFromHyd);
    }

    public static void departure() {
        TrainBuilder.destination(allBogies);
    }
}
