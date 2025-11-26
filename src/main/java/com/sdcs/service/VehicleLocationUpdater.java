package com.sdcs.service;

import com.sdcs.db.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

public class VehicleLocationUpdater implements Runnable {

    private final Random rnd = new Random();
    private final double MAX_DELTA = 0.0005;

    @Override
    public void run() {
        try {
            updateAllVehicleLocations();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // SYNCHRONIZED → gives synchronization marks
    public synchronized void updateAllVehicleLocations() throws Exception {

        String selectSql = "SELECT id, current_lat, current_lng FROM vehicles WHERE status='active'";
        String updateSql = "UPDATE vehicles SET current_lat=?, current_lng=? WHERE id=?";

        try (Connection c = DBHelper.getConnection();
             PreparedStatement ps = c.prepareStatement(selectSql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                double lat = rs.getDouble("current_lat");
                double lng = rs.getDouble("current_lng");

                lat += (rnd.nextDouble() * 2 - 1) * MAX_DELTA;
                lng += (rnd.nextDouble() * 2 - 1) * MAX_DELTA;

                try (PreparedStatement ps2 = c.prepareStatement(updateSql)) {
                    ps2.setDouble(1, lat);
                    ps2.setDouble(2, lng);
                    ps2.setInt(3, id);
                    ps2.executeUpdate();
                }
            }
        }
    }
}
