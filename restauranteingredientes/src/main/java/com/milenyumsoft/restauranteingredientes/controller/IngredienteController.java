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

    @GetMapping( "/listat/{id}")
    public Ingrediente listarIngredienteid(@PathVariable Long id){
        return ingredientesService.getIngrediente(id);

    }

    @PutMapping("/actualizar")
    public Ingrediente actualizarIngrediente(@RequestBody Ingrediente ingrediente) {
        ingredientesService.updateIngrediente(ingrediente);
        Ingrediente ing = ingredientesService.getIngrediente(ingrediente.getId_ingrediente());
        return ing;
    }


}
