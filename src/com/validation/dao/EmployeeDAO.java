package com.validation.dao;

import com.validation.config.DBConnection;
import com.validation.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

@Repository
public class EmployeeDAO {

    @Autowired
    private DBConnection dbConnection;

    public void insert(Employee employee) {
        String sql = "INSERT INTO employee (username, email, password) VALUES (?, ?, ?)";

        try (Connection connection = dbConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, employee.getUsername());
            ps.setString(2, employee.getEmail());
            ps.setString(3, employee.getPassword());

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new employee was inserted successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
