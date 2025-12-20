package com.sdcs.service;

import com.sdcs.db.DBHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class LogService {

    public static void addLog(String message) {
        try (Connection con = DBHelper.getConnection()) {
            String sql = "INSERT INTO activity_logs(message) VALUES(?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, message);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
