package com.example.geektrust;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainInput {
    public static Scanner getFileScanner(String filePath) throws FileNotFoundException {
        InputStreamReader fin = new FileReader(filePath);
        return new Scanner(fin);
    }

    public static List<String> getTrains(Scanner sc) {
        List<String> trains = new ArrayList<>();
        while (sc.hasNextLine()) {
            trains.add(sc.nextLine());
        }
        return trains;
    }

}
