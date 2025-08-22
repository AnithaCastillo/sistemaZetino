package org.esfe.sistemaZetino.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "muestras")
public class Muestra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_muestra")
    private Integer idMuestra;

    @NotNull(message = "El id de la orden es obligatorio")
    @Column(name = "id_orden")
    private Integer idOrden;

    @NotBlank(message = "El tipo de muestra es obligatorio")
    @Column(name = "tipo_muestra")
    private String tipoMuestra;

    @NotNull(message = "La fecha de recepción es obligatoria")
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_recepcion")
    private Date fechaRecepcion;

    @NotBlank(message = "El estado es obligatorio")
    private String estado;

    // Getters y Setters
    public Integer getIdMuestra() {
        return idMuestra;
    }

    public void setIdMuestra(Integer idMuestra) {
        this.idMuestra = idMuestra;
    }

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public String getTipoMuestra() {
        return tipoMuestra;
    }

    public void setTipoMuestra(String tipoMuestra) {
        this.tipoMuestra = tipoMuestra;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
