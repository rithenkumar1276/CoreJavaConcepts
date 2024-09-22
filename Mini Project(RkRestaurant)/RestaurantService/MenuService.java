package com.evergent.CoreJava.RestaurantService;

import java.util.List;
import com.evergent.CoreJava.RestaurantBean.*;
import com.evergent.CoreJava.RestaurantDao.*;

public class MenuService {
    MenuDAO menuDAO = new MenuDAO();

    public List<MenuItem> getAllMenuItems() {
        return menuDAO.getMenuItems();
    }
}
