package org.esfe.sistemaZetino.domain.model;

public class Examen {

    private Integer idExamen;
    private Integer idOrden;
    private String nombreExamen;
    private String descripcion;
    private Integer tiempoEstimado;
    private Double precio;
    private String estado;

    // Constructor vacío
    public Examen() {}

    // Constructor con validaciones
    public Examen(Integer idExamen, Integer idOrden, String nombreExamen, String descripcion,
                  Integer tiempoEstimado, Double precio, String estado) {
        this.setIdExamen(idExamen);
        this.setIdOrden(idOrden);
        this.setNombreExamen(nombreExamen);
        this.setDescripcion(descripcion);
        this.setTiempoEstimado(tiempoEstimado);
        this.setPrecio(precio);
        this.setEstado(estado);
    }

    // Getters y Setters con validaciones
    public Integer getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(Integer idExamen) {
        if (idExamen != null && idExamen < 0) {
            throw new IllegalArgumentException("El id del examen no puede ser negativo");
        }
        this.idExamen = idExamen;
    }

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        if (idOrden == null || idOrden < 0) {
            throw new IllegalArgumentException("El id de orden es obligatorio y no puede ser negativo");
        }
        this.idOrden = idOrden;
    }

    public String getNombreExamen() {
        return nombreExamen;
    }

    public void setNombreExamen(String nombreExamen) {
        if (nombreExamen == null || nombreExamen.isBlank()) {
            throw new IllegalArgumentException("El nombre del examen es obligatorio");
        }
        this.nombreExamen = nombreExamen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null && descripcion.length() > 500) {
            throw new IllegalArgumentException("La descripción no puede exceder 500 caracteres");
        }
        this.descripcion = descripcion;
    }

    public Integer getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(Integer tiempoEstimado) {
        if (tiempoEstimado == null || tiempoEstimado <= 0) {
            throw new IllegalArgumentException("El tiempo estimado debe ser mayor que 0");
        }
        this.tiempoEstimado = tiempoEstimado;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        if (precio == null || precio < 0) {
            throw new IllegalArgumentException("El precio es obligatorio y no puede ser negativo");
        }
        this.precio = precio;
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
