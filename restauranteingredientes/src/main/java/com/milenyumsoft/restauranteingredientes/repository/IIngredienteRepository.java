package com.milenyumsoft.restauranteingredientes.repository;

import com.milenyumsoft.restauranteingredientes.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IIngredienteRepository extends JpaRepository<Ingrediente, Long> {


    @Query("SELECT ing FROM Ingrediente ing JOIN ing.lista_platos lp WHERE lp = :nombrePlato")
    List<Ingrediente> findAllBy_ingredientes_nombrePlato(String nombrePlato);
}
