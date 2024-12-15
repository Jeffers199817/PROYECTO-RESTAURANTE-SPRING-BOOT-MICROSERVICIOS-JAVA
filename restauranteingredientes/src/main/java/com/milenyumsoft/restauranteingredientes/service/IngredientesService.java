package com.milenyumsoft.restauranteingredientes.service;

import com.milenyumsoft.restauranteingredientes.model.Ingrediente;
import com.milenyumsoft.restauranteingredientes.repository.IIngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientesService implements IIngredientesService{


   @Autowired
    private IIngredienteRepository ingredienteRepository;
    @Override
    public void addIngrediente(Ingrediente ingrediente) {


    }

    @Override
    public void deleteIngrediente(Long id) {

    }

    @Override
    public List<Ingrediente> getIngredientes() {
        return List.of();
    }

    @Override
    public Ingrediente getIngrediente(Long id) {
        return null;
    }

    @Override
    public Ingrediente updateIngrediente(Ingrediente ingrediente) {
        return null;
    }
}
