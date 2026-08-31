package com.validation.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.sql.Connection;
import java.sql.DriverManager;

@Component
public class DBConnection {
    @Value("${database.url}")
    private String url;
    @Value("${database.username}")
    private String userName;
    @Value("${database.password}")
    private String password;

    public Connection getConnection() throws Exception {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            System.out.println("Error establishing database connection");
            e.printStackTrace();
        }
        return null;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
