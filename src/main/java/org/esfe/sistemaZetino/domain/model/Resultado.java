package org.esfe.sistemaZetino.domain.model;

import java.util.Date;

public class Resultado {

    private Long idResultado;
    private Muestra muestra;
    private UsuarioSistema usuario;
    private Examen examen;
    private Date fechaEntrega;
    private String observaciones;
    private String archivoResultado;

    // Constructor vacío
    public Resultado() {}

    // Constructor con validaciones
    public Resultado(Long idResultado, Muestra muestra, UsuarioSistema usuario, Examen examen,
                     Date fechaEntrega, String observaciones, String archivoResultado) {
        this.setIdResultado(idResultado);
        this.setMuestra(muestra);
        this.setUsuario(usuario);
        this.setExamen(examen);
        this.setFechaEntrega(fechaEntrega);
        this.setObservaciones(observaciones);
        this.setArchivoResultado(archivoResultado);
    }

    // Getters y Setters con validaciones
    public Long getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(Long idResultado) {
        if (idResultado != null && idResultado < 0) {
            throw new IllegalArgumentException("El id del resultado no puede ser negativo");
        }
        this.idResultado = idResultado;
    }

    public Muestra getMuestra() {
        return muestra;
    }

    public void setMuestra(Muestra muestra) {
        if (muestra == null) {
            throw new IllegalArgumentException("La muestra es obligatoria");
        }
        this.muestra = muestra;
    }

    public UsuarioSistema getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioSistema usuario) {
        if (usuario == null) {
            throw new IllegalArgumentException("El usuario es obligatorio");
        }
        this.usuario = usuario;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        if (examen == null) {
            throw new IllegalArgumentException("El examen es obligatorio");
        }
        this.examen = examen;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        if (fechaEntrega == null) {
            throw new IllegalArgumentException("La fecha de entrega es obligatoria");
        }
        Date hoy = new Date();
        if (fechaEntrega.after(hoy)) {
            throw new IllegalArgumentException("La fecha de entrega no puede estar en el futuro");
        }
        this.fechaEntrega = fechaEntrega;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        if (observaciones != null && observaciones.length() > 1000) {
            throw new IllegalArgumentException("Las observaciones no pueden superar 1000 caracteres");
        }
        this.observaciones = observaciones;
    }

    public String getArchivoResultado() {
        return archivoResultado;
    }

    public void setArchivoResultado(String archivoResultado) {
        if (archivoResultado != null && archivoResultado.length() > 255) {
            throw new IllegalArgumentException("El archivo de resultado no puede superar 255 caracteres");
        }
        this.archivoResultado = archivoResultado;
    }
}
