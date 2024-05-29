package com.helpdesk.sistemacitas.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CitaMedica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private String especialidad;
    private String motivo;
    private String descripcion;
    private Boolean esSeguimiento;
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

}