package com.kotak.dao;


import com.kotak.branches.Branch;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;

@Repository
public class BranchDAO {
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    @PostConstruct
    //jdbc init logic
    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kotak?useSSL=false", "root", "root");
            statement = connection.createStatement();
            System.out.println("Connected to DB");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public Branch getBranch(long ifsc) throws SQLException {

        try {
            resultSet = statement.executeQuery("SELECT * FROM branch WHERE br_ifsc" + "=" + ifsc);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Branch branch = new Branch();
        while (resultSet.next()){
            branch.setIfsc(resultSet.getInt(1));
            branch.setLocation(resultSet.getString(2));
            branch.setManager(resultSet.getString(3));
            branch.setServiceType(resultSet.getString(4));
            branch.setEmployeeStrength(resultSet.getInt(5));
        }
        System.out.println(branch);
        return branch;
    }

    @PreDestroy
    public void destroy() {

            try {
                if (statement != null) {
                    statement.close();
                    statement = null;
                }
                if (connection != null) {
                    connection.close();
                    connection = null;
                }
                System.out.println("Disconnected from DB");
            } catch (SQLException e) {
            }

        //jdbc release connection
    }

}
