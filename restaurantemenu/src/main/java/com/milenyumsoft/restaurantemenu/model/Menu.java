package com.milenyumsoft.restaurantemenu.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlato;
    private Long numeroPlato;
    private String nombrePlato;
    private double precioPlato;
    private String descripcionPlato;

    @ElementCollection
    private List<String> listaIngredientes;
}
