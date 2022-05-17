package com.example.geektrust;

import java.util.HashMap;
import java.util.Map;

public class TrainRoutes {
    public static final Map<String, Integer> distFromHYB;

    static {
        distFromHYB = new HashMap<>();
        distFromHYB.put("CHN", (0 - 1200));
        distFromHYB.put("SLM", (350 - 1200));
        distFromHYB.put("BLR", (550 - 1200));
        distFromHYB.put("KRN", (900 - 1200));
        distFromHYB.put("HYB", 0);
        distFromHYB.put("NGP", (1600 - 1200));
        distFromHYB.put("ITJ", (1900 - 1200));
        distFromHYB.put("BPL", (2000 - 1200));
        distFromHYB.put("AGA", (2500 - 1200));
        distFromHYB.put("NDL", (2700 - 1200));

        distFromHYB.put("TVC", -2000);
        distFromHYB.put("SRR", (300 - 2000));
        distFromHYB.put("MAQ", (600 - 2000));
        distFromHYB.put("MAO", (1000 - 2000));
        distFromHYB.put("PNE", (1400 - 2000));
        distFromHYB.put("NGP", (2400 - 2000));
        distFromHYB.put("ITJ", (2700 - 2000));
        distFromHYB.put("BPL", (2800 - 2000));
        distFromHYB.put("PTA", (3800 - 2000));
        distFromHYB.put("NJP", (4200 - 2000));
        distFromHYB.put("GHY", (4700 - 2000));
    }
}
