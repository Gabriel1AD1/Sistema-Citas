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
public class CitaMedica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;
    private String especialidad;
    private String motivo;
    private String descripcion;
    private Boolean esSeguimiento;
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

}