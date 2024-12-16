package com.milenyumsoft.restauranteingredientes.controller;

import com.milenyumsoft.restauranteingredientes.model.Ingrediente;
import com.milenyumsoft.restauranteingredientes.service.IIngredientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingrediente")
public class IngredienteController {

    @Autowired
    private IIngredientesService ingredientesService;

    @PostMapping("/crear")
    public String crearIngrediente(@RequestBody Ingrediente ingrediente){
        ingredientesService.addIngrediente(ingrediente);
        return "Ingrediente creado, exitosamente";
    }


    @GetMapping("/listar")
    public List<Ingrediente> listarIngrediente(){

       return ingredientesService.getIngredientes();
    }

}
