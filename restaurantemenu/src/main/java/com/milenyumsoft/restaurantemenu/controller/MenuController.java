package com.milenyumsoft.restaurantemenu.controller;

import com.milenyumsoft.restaurantemenu.model.Menu;
import com.milenyumsoft.restaurantemenu.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private IMenuService menuService;


    @PostMapping("/crear")
    public String crearMenu(@RequestBody Menu menu){
        menuService.createdMenu(menu);
        return "Menu creado, exitosamente";
    }

    @GetMapping("/listar")
    public List<Menu> listarMenu(){
        return menuService.getMenus();
    }

    @GetMapping("/listar/{id}")
    public Menu listarMenuId(@PathVariable Long id){
        return menuService.getMenu(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarMenu(@PathVariable Long id){
        menuService.deleteMenu(id);
        return "Menu eliminado, exitosamente";
    }

    @PutMapping("/actualizar")
    public Menu actualizarMenu(@RequestBody Menu menu){
        menuService.updateMenu(menu);

       Menu men=  menuService.getMenu(menu.getIdPlato());

        return men;


    }

}
