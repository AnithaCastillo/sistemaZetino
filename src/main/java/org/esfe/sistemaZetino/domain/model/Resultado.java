package org.esfe.sistemaZetino.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "resultado")
public class Resultado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_resultado")
    private Long idResultado;

    @NotNull(message = "La muestra es obligatoria")
    @ManyToOne
    @JoinColumn(name = "id_muestra", nullable = false)
    private Muestra muestra;

    @NotNull(message = "El usuario es obligatorio")
    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private UsuarioSistema usuario;

    @NotNull(message = "El examen es obligatorio")
    @ManyToOne
    @JoinColumn(name = "id_examen", nullable = false)
    private Examen examen;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_entrega", nullable = false)
    private Date fechaEntrega;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "archivo_resultado")
    private String archivoResultado;

    // Getters y Setters
    public Long getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(Long idResultado) {
        this.idResultado = idResultado;
    }

    public Muestra getMuestra() {
        return muestra;
    }

    public void setMuestra(Muestra muestra) {
        this.muestra = muestra;
    }

    public UsuarioSistema getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioSistema usuario) {
        this.usuario = usuario;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getArchivoResultado() {
        return archivoResultado;
    }

    public void setArchivoResultado(String archivoResultado) {
        this.archivoResultado = archivoResultado;
    }
}
