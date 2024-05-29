package com.helpdesk.sistemacitas.repository;

import com.helpdesk.sistemacitas.models.CitaMedica;
import com.helpdesk.sistemacitas.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CitaMedicaRepository extends JpaRepository<CitaMedica, Long> {
    List<CitaMedica> findByPacienteId(Long pacienteId);
    List<CitaMedica> findOneByEspecialidad(String especialidad);
    List<CitaMedica> findOneByMotivo(String motivo);
    List<CitaMedica> findOneByDescripcion(String descripcion);


}
