package com.helpdesk.sistemacitas.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer dni;
    private String nombre;
    private String apellido;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<CitaMedica> historialTratamientos;
}
