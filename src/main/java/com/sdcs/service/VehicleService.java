package com.sdcs.service;

import com.sdcs.db.DBHelper;
import com.sdcs.model.Vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VehicleService {

    public static List<Vehicle> listAll() {
        List<Vehicle> out = new ArrayList<>();

        String sql = "SELECT id, vehicle_number, status, current_lat, current_lng FROM vehicles";

        try (Connection c = DBHelper.getConnection();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Vehicle v = new Vehicle(
                        rs.getInt("id"),
                        rs.getString("vehicle_number"),   // maps to Vehicle.name
                        rs.getString("status"),
                        rs.getDouble("current_lat"),
                        rs.getDouble("current_lng")
                );
                out.add(v);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return out;
    }

    public static boolean add(String vehicleNumber, String status, Double lat, Double lon) {

        String sql = "INSERT INTO vehicles (vehicle_number, status, current_lat, current_lng) VALUES (?, ?, ?, ?)";

        try (Connection c = DBHelper.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, vehicleNumber);
            ps.setString(2, status);

            if (lat == null) ps.setNull(3, java.sql.Types.DOUBLE);
            else ps.setDouble(3, lat);

            if (lon == null) ps.setNull(4, java.sql.Types.DOUBLE);
            else ps.setDouble(4, lon);

            return ps.executeUpdate() > 0;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
