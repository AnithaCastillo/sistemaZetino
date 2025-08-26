package org.esfe.sistemaZetino.domain.model;

public class Rol {

    private Long idRol;
    private String nombre;
    private String estado;

    // Constructor vacío
    public Rol() {}

    // Constructor con validaciones
    public Rol(Long idRol, String nombre, String estado) {
        this.setIdRol(idRol);
        this.setNombre(nombre);
        this.setEstado(estado);
    }

    // Getters y Setters con validaciones
    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        if (idRol != null && idRol < 0) {
            throw new IllegalArgumentException("El id del rol no puede ser negativo");
        }
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del rol es obligatorio");
        }
        this.nombre = nombre;
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
