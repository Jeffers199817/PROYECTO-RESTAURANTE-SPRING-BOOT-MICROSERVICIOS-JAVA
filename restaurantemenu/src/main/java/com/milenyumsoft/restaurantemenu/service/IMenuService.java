package com.milenyumsoft.restaurantemenu.service;

import com.milenyumsoft.restaurantemenu.model.Menu;
import java.util.List;

public interface IMenuService {

public void createdMenu(Menu menu);


public void deleteMenu(Long id);

public List<Menu> getMenus();

public Menu getMenu(Long id);

public Menu updateMenu(Menu menu);
        }