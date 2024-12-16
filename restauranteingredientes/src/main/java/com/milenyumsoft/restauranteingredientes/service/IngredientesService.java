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
        ingredienteRepository.save(ingrediente);


    }

    @Override
    public void deleteIngrediente(Long id) {
        ingredienteRepository.deleteById(id);

    }

    @Override
    public List<Ingrediente> getIngredientes() {

        return ingredienteRepository.findAll();
    }

    @Override
    public Ingrediente getIngrediente(Long id) {
        return ingredienteRepository.findById(id).get();
    }

    @Override
    public Ingrediente updateIngrediente(Ingrediente ingrediente) {

        Ingrediente ing = ingredienteRepository.findById(ingrediente.getId_ingrediente()).get();

        ing.setNombre_ingrediente(ing.getNombre_ingrediente());
        ing.setLista_platos(ing.getLista_platos());

        this.addIngrediente(ing);

        return  ing;
    }

    @Override
    public List<Ingrediente> getIngredientesPorPlato(String nombrePlato) {

        return ingredienteRepository.findAllBy_ingredientes_nombrePlato(nombrePlato);

    }
}
