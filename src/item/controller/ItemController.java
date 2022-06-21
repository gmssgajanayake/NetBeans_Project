/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package item.controller;

import dbConnection.DBConnection;
import item.module.Item;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author G.M.Sakuja Shamal
 */
public class ItemController {
    public static boolean addItem(Item item) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection()
                .prepareStatement("INSERT INTO Item VALUES(?,?,?,?)");
        preparedStatement.setObject(1,item.getCode());
        preparedStatement.setObject(2,item.getDescription());
        preparedStatement.setObject(3,item.getUnitPrice());
        preparedStatement.setObject(4,item.getQuantityOnHand());
        return preparedStatement.executeUpdate()>0;
    }
    public static Item searchItem(String code) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement()
                .executeQuery("SELECT * FROM Item WHERE code='" + code + "'");
        return resultSet.next() ? new Item(
                resultSet.getString(1),
                resultSet.getString(2),
                Double.parseDouble(resultSet.getString(3)),
                Double.parseDouble(resultSet.getString(4))
        ) : null;
    }
    public static boolean updateItem(Item item) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement
                ("UPDATE Item SET description=?,unitPrice=?,qtyOnHand=? WHERE code='" + item.getCode() + "'");
        preparedStatement.setObject(1,item.getDescription());
        preparedStatement.setObject(2,item.getUnitPrice());
        preparedStatement.setObject(3,item.getQuantityOnHand());
        return preparedStatement.executeUpdate()>0;
    }
    public static boolean deleteItem(String code) throws SQLException, ClassNotFoundException {
        return DBConnection.getInstance().getConnection().createStatement()
                .executeUpdate("DELETE FROM Item WHERE code='" + code + "'")>0;
    }
    public static ResultSet viewItem() throws SQLException, ClassNotFoundException {
        return DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM Item");
    }

}
