package com.helpdesk.sistemacitas.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

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

    public boolean esTratamientoSimilar(CitaMedica otraCita) {
        // Define la lógica para determinar si el tratamiento es similar
        // Esto puede incluir comparar tipo de tratamiento, fecha, médico, etc.
        return this.especialidad.equals(otraCita.especialidad) && this.motivo.equals(otraCita.motivo);
    }
}