package com.learning.springboot.Learning.Spring.Boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
public class DatabaseConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public String checkConnection() {
        try (Connection connection = dataSource.getConnection()) {
            if (connection.isValid(2)) { // 2 seconds timeout for validity check
                System.out.println("Database connection is successful.");
                return "Database connection is successful.";
            } else {
                System.out.println("Database connection failed.");
                return "Database connection failed.";
            }
        } catch (SQLException e) {
            System.err.println("Error checking database connection: " + e.getMessage());
            return e.getMessage();
        }
    }
}
