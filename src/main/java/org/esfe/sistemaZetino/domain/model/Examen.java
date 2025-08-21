package org.esfe.sistemaZetino.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "examenes")
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_examen")
    private Integer idExamen;

    @NotNull(message = "El id de orden es obligatorio")
    @Column(name = "id_orden")
    private Integer idOrden;

    @NotBlank(message = "El nombre del examen es obligatorio")
    @Column(name = "nombre_examen")
    private String nombreExamen;

    private String descripcion;

    @NotNull(message = "El tiempo estimado es obligatorio")
    @Column(name = "tiempo_estimado")
    private Integer tiempoEstimado;

    @NotNull(message = "El precio es obligatorio")
    private Double precio;

    @NotBlank(message = "El estado es obligatorio")
    private String estado;

    // Getters y Setters
    public Integer getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(Integer idExamen) {
        this.idExamen = idExamen;
    }

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public String getNombreExamen() {
        return nombreExamen;
    }

    public void setNombreExamen(String nombreExamen) {
        this.nombreExamen = nombreExamen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(Integer tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
