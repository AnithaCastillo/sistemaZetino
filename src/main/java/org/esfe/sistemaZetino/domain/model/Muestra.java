package org.esfe.sistemaZetino.domain.model;

import java.util.Date;

public class Muestra {

    private Integer idMuestra;
    private Integer idOrden;
    private String tipoMuestra;
    private Date fechaRecepcion;
    private String estado;

    // Constructor vacío
    public Muestra() {}

    // Constructor con validaciones
    public Muestra(Integer idMuestra, Integer idOrden, String tipoMuestra, Date fechaRecepcion, String estado) {
        this.setIdMuestra(idMuestra);
        this.setIdOrden(idOrden);
        this.setTipoMuestra(tipoMuestra);
        this.setFechaRecepcion(fechaRecepcion);
        this.setEstado(estado);
    }

    // Getters y Setters con validaciones
    public Integer getIdMuestra() {
        return idMuestra;
    }

    public void setIdMuestra(Integer idMuestra) {
        if (idMuestra != null && idMuestra < 0) {
            throw new IllegalArgumentException("El id de muestra no puede ser negativo");
        }
        this.idMuestra = idMuestra;
    }

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        if (idOrden == null) {
            throw new IllegalArgumentException("El id de la orden es obligatorio");
        }
        this.idOrden = idOrden;
    }

    public String getTipoMuestra() {
        return tipoMuestra;
    }

    public void setTipoMuestra(String tipoMuestra) {
        if (tipoMuestra == null || tipoMuestra.isBlank()) {
            throw new IllegalArgumentException("El tipo de muestra es obligatorio");
        }
        this.tipoMuestra = tipoMuestra;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        if (fechaRecepcion == null) {
            throw new IllegalArgumentException("La fecha de recepción es obligatoria");
        }
        this.fechaRecepcion = fechaRecepcion;
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
