package org.esfe.sistemaZetino.domain.model;

public class UsuarioSistema {

    private Integer idUsuario;
    private Integer idRol;
    private String nombre;
    private String clave;
    private String estado;

    // Constructor vacío
    public UsuarioSistema() {}

    // Constructor con validaciones
    public UsuarioSistema(Integer idUsuario, Integer idRol, String nombre, String clave, String estado) {
        this.setIdUsuario(idUsuario);
        this.setIdRol(idRol);
        this.setNombre(nombre);
        this.setClave(clave);
        this.setEstado(estado);
    }

    // Getters y Setters con validaciones
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        if (idUsuario != null && idUsuario < 0) {
            throw new IllegalArgumentException("El id del usuario no puede ser negativo");
        }
        this.idUsuario = idUsuario;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        if (idRol == null || idRol < 0) {
            throw new IllegalArgumentException("El id del rol es obligatorio y no puede ser negativo");
        }
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del usuario es obligatorio");
        }
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        if (clave == null || clave.length() < 4) {
            throw new IllegalArgumentException("La clave es obligatoria y debe tener al menos 4 caracteres");
        }
        this.clave = clave;
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
