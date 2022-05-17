package com.example.geektrust;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class TrainBuilder {
    private final String trainName;
    private final String[] bogies;

    public TrainBuilder(String trainName, String[] bogies) {
        this.trainName = trainName;
        this.bogies = bogies;
    }

    public static void destination(List<String> bogiesFromHYB) {
        List<Integer> bogieValues = new ArrayList<>();
        for (String bogie : bogiesFromHYB) {
            if (bogie.equals("TRAIN_A") || bogie.equals("TRAIN_B") || bogie.equals("ENGINE"))
                continue;
            else {
                bogieValues.add(TrainRoutes.distFromHYB.get(bogie));
            }
        }
        Collections.sort(bogieValues, Collections.reverseOrder());
        System.out.print("DEPARTURE TRAIN_AB ENGINE ENGINE ");
        for (int i = 0; i < bogieValues.size(); i++)
            System.out.print(getKey(TrainRoutes.distFromHYB, bogieValues.get(i)) + " ");

    }

    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }

    public List<String> BogiesToHYB(String trainName, String[] bogies) {
        StringBuilder bogieList = new StringBuilder();
        List<String> bogiesFromHyd = new ArrayList<>();
        for (String bogie : bogies) {
            if (TrainRoutes.distFromHYB.get(bogie) == null || TrainRoutes.distFromHYB.get(bogie) < TrainRoutes.distFromHYB.get("HYB"))
                continue;
            if (TrainRoutes.distFromHYB.get(bogie) == TrainRoutes.distFromHYB.get("HYB"))
                bogieList.append(" ").append(bogie);
            else {
                bogiesFromHyd.add(bogie);
                bogieList.append(" ").append(bogie);
            }
        }
        System.out.println("ARRIVAL " + trainName + " " + "ENGINE" + bogieList);
        return bogiesFromHyd;
    }

}
