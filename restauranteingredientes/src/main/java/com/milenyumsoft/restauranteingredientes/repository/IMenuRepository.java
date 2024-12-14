package com.milenyumsoft.restauranteingredientes.repository;

import com.milenyumsoft.restauranteingredientes.model.menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMenuRepository extends JpaRepository<menu, Long> {
}
