package com.helpdesk.sistemacitas.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer dni;
    private String nombre;
    private String apellido;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Tratamiento> historialTratamientos;
}
