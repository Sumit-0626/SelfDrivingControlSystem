package com.sdcs.auth;

import com.sdcs.db.DBHelper;
import com.sdcs.exception.InvalidLoginException;
import com.sdcs.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthService {

    public static User login(String username, String password) throws InvalidLoginException {

        String sql = "SELECT * FROM users WHERE username=? AND password=?";

        try (Connection c = DBHelper.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                int id = rs.getInt("id");
                String role = rs.getString("role");

                // POLYMORPHISM: create object based on role
                switch (role) {
                    case "admin":
                        return new Admin(id, username, password);

                    case "driver":
                        return new Driver(id, username, password);

                    case "technician":
                        return new Technician(id, username, password);

                    default:
                        throw new InvalidLoginException("Unknown user role.");
                }

            } else {
                throw new InvalidLoginException("Invalid username or password.");
            }

        } catch (InvalidLoginException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new InvalidLoginException("Login failed due to system error.");
        }
    }
}
