package com.milenyumsoft.restauranteingredientes.service;

import com.milenyumsoft.restauranteingredientes.model.Ingrediente;

import java.util.List;

public interface IIngredientesService {

    public void addIngrediente(Ingrediente ingrediente);

    public void deleteIngrediente(Long id);

    public List<Ingrediente> getIngredientes();

    public Ingrediente getIngrediente(Long id);

    public Ingrediente updateIngrediente(Ingrediente ingrediente);

    public List<Ingrediente> getIngredientesPorPlato(String nombrePlato);
}
