package com.milenyumsoft.restaurantemenu.repository;


import com.milenyumsoft.restaurantemenu.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMenuRepository extends JpaRepository<Menu, Long> {
}