package com.sdcs.algo;

import java.util.Random;

public class DynamicRouteService {

    public static boolean isTrafficHigh() {
        return new Random().nextBoolean(); // simulate traffic
    }

    public static void reRouteIfNeeded() {
        if (isTrafficHigh()) {
            System.out.println("Traffic detected! Recalculating route...");
            // call Dijkstra again
        }
    }
}
