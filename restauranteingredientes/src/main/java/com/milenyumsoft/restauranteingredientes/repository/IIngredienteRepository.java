package com.milenyumsoft.restauranteingredientes.repository;

import com.milenyumsoft.restauranteingredientes.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIngredienteRepository extends JpaRepository<Ingrediente, Long> {
}
