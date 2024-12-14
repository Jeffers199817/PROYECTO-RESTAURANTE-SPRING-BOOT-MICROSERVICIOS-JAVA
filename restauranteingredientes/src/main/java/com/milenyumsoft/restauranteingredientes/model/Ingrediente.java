package com.milenyumsoft.restauranteingredientes.model;

import jakarta.persistence.ElementCollection;

import java.util.List;

public class Ingrediente {

    private Long id_ingrediente;
    private String nombre_ingrediente;

    @ElementCollection
    private List<String> lista_platos;
}
