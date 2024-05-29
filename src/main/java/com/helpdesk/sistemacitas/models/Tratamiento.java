package com.helpdesk.sistemacitas.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tratamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Boolean esActivo;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    // Getters y setters
}