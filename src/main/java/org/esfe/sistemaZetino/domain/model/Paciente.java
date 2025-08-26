package org.esfe.sistemaZetino.domain.model;

import java.util.Date;

public class Paciente {

    private Long idPaciente;
    private String nombre;
    private String apellido;
    private Integer telefono;
    private String correo;
    private Date fechaNacimiento;
    private String estado;

    // Constructor vacío
    public Paciente() {}

    // Constructor con validaciones
    public Paciente(Long idPaciente, String nombre, String apellido, Integer telefono,
                    String correo, Date fechaNacimiento, String estado) {
        this.setIdPaciente(idPaciente);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setTelefono(telefono);
        this.setCorreo(correo);
        this.setFechaNacimiento(fechaNacimiento);
        this.setEstado(estado);
    }

    // Getters y Setters con validaciones
    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        if (idPaciente != null && idPaciente < 0) {
            throw new IllegalArgumentException("El id del paciente no puede ser negativo");
        }
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido == null || apellido.isBlank()) {
            throw new IllegalArgumentException("El apellido es obligatorio");
        }
        this.apellido = apellido;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        if (telefono == null || telefono <= 0) {
            throw new IllegalArgumentException("El teléfono es obligatorio y debe ser un número válido");
        }
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo != null && !correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Correo inválido");
        }
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        if (fechaNacimiento == null) {
            throw new IllegalArgumentException("La fecha de nacimiento es obligatoria");
        }
        Date hoy = new Date();
        if (fechaNacimiento.after(hoy)) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser en el futuro");
        }
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado == null || estado.isBlank()) {
            throw new IllegalArgumentException("El estado es obligatorio");
        }
        this.estado = estado;
    }
}
