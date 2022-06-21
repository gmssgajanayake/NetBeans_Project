/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer.controller;

import customer.module.Customer;
import dbConnection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author G.M.Sakuja Shamal
 */
public class CustomerController {
    public static boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection()
                .prepareStatement("INSERT INTO Customer VALUES(?,?,?,?)");
        preparedStatement.setObject(1,customer.getId());
        preparedStatement.setObject(2,customer.getName());
        preparedStatement.setObject(3,customer.getAddress());
        preparedStatement.setObject(4,customer.getSalary());
        return preparedStatement.executeUpdate()>0;
    }
    public static Customer searchCustomer(String id) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement()
                .executeQuery("SELECT * FROM Customer WHERE id='" + id + "'");
        return resultSet.next() ? new Customer(
                resultSet.getString("id"),
                resultSet.getString("name"),
                resultSet.getString("address"),
                resultSet.getDouble("salary")
                ) : null;
    }
    public static boolean updateCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement
                ("UPDATE Customer SET name=?,address=?,salary=? WHERE id='" + customer.getId() + "'");
        preparedStatement.setObject(1,customer.getName());
        preparedStatement.setObject(2,customer.getAddress());
        preparedStatement.setObject(3,customer.getSalary());
        return preparedStatement.executeUpdate()>0;
    }
    public static boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        return DBConnection.getInstance().getConnection().createStatement()
                .executeUpdate("DELETE FROM Customer WHERE id='" + id + "'")>0;
    }
    public static ResultSet viewCustomer() throws SQLException, ClassNotFoundException {
       return DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM Customer");
    }
}
