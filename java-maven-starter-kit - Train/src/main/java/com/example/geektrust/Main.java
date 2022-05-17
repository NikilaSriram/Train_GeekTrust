package com.example.geektrust;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner sc = TrainInput.getFileScanner(args[0]);
            List<String> trains = TrainInput.getTrains(sc);

            for (String train : trains) {
                String[] bogies = train.split(" ");
                String trainName = bogies[0];
                TrainService.createTrain(trainName, bogies);
            }
            TrainService.departure();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
