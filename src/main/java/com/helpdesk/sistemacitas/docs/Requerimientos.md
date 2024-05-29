
1. **Registro de un Nuevo Paciente**
    - El paciente llega a la clínica.
    - El recepcionista registra al nuevo paciente en el sistema con la información requerida.
    - El sistema verifica que el paciente no esté previamente registrado y crea un nuevo registro.

2. **Registro de una Nueva Cita**
    - El paciente solicita una cita.
    - El recepcionista selecciona la especialidad y verifica el historial de citas del paciente.
    - El sistema determina si es una nueva cita o una cita de seguimiento basada en el historial.
    - El recepcionista registra la cita con la fecha, hora, especialidad, motivo y tipo de cita.
    - El sistema envía una confirmación de cita al paciente.

3. **Consulta del Historial de Citas**
    - El médico o el personal autorizado consulta el historial de citas de un paciente.
    - El sistema muestra todas las citas previas con detalles pertinentes.
    - El médico puede marcar una cita como parte de un tratamiento en curso si es necesario.

### Consideraciones Técnicas

- **Base de Datos**
    - Base de datos relacional para almacenar la información de pacientes, citas y usuarios.
    - Tablas principales: Pacientes, Usuarios

- **Interfaz de Usuario**
    - Aplicación web accesible desde navegadores modernos.
    - Formularios de entrada para registrar pacientes y citas.
    - Panel de administración para gestionar pacientes y citas.

- **Tecnologías**
    - Lenguajes de programación: Java
    - Frameworks: Spring
    - Base de datos: MySQL. H2

