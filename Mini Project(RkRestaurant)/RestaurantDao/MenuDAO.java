package com.evergent.CoreJava.RestaurantDao;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

import com.evergent.CoreJava.RestaurantBean.*;

public class MenuDAO {
    public List<MenuItem> getMenuItems() {
        List<MenuItem> items = new ArrayList<>();
        try (Connection con = RestaurantDBConnection.getConnection()) {
            String query = "SELECT * FROM menu_items";
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                MenuItem item = new MenuItem();
                item.setId(rs.getInt("id"));
                item.setName(rs.getString("name"));
                item.setType(rs.getString("type"));
                item.setPrice(rs.getDouble("price"));
                items.add(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return items;
    }

    // Other menu-related methods...
}

