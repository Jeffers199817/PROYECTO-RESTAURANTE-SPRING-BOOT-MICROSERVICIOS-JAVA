package com.milenyumsoft.restaurantemenu.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ingrediente {

    private Long id_ingrediente;
    private String nombre_ingrediente;
    private List<String> lista_platos;


}
