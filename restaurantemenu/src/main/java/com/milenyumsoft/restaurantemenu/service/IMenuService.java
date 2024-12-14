package com.milenyumsoft.restaurantemenu.service;

import java.awt.*;
import java.util.List;

public interface IMenuService {

public void addMenu(Menu menu);

public void deleteMenu(Long id);

public List<Menu> getMenus();

public Menu getMenu(Long id);

public Menu updateMenu(Menu menu);
        }