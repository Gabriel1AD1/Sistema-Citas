package com.helpdesk.sistemacitas.repository;

import com.helpdesk.sistemacitas.models.CitaMedica;
import com.helpdesk.sistemacitas.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Optional<Paciente> findOneByDni(Integer dni);
}
