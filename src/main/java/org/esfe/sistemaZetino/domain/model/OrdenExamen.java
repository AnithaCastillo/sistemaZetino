package org.esfe.sistemaZetino.domain.model;

import java.util.Date;

public class OrdenExamen {

    private Long idOrden;
    private Paciente paciente;
    private UsuarioSistema usuario;
    private Date fechaSolicitud;
    private Boolean estado;

    // Constructor vacío
    public OrdenExamen() {}

    // Constructor con validaciones
    public OrdenExamen(Long idOrden, Paciente paciente, UsuarioSistema usuario,
                       Date fechaSolicitud, Boolean estado) {
        this.setIdOrden(idOrden);
        this.setPaciente(paciente);
        this.setUsuario(usuario);
        this.setFechaSolicitud(fechaSolicitud);
        this.setEstado(estado);
    }

    // Getters y Setters con validaciones
    public Long getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Long idOrden) {
        if (idOrden != null && idOrden < 0) {
            throw new IllegalArgumentException("El id de la orden no puede ser negativo");
        }
        this.idOrden = idOrden;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        if (paciente == null) {
            throw new IllegalArgumentException("El paciente es obligatorio");
        }
        this.paciente = paciente;
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

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        if (fechaSolicitud == null) {
            throw new IllegalArgumentException("La fecha de solicitud es obligatoria");
        }
        Date hoy = new Date();
        if (fechaSolicitud.after(hoy)) {
            throw new IllegalArgumentException("La fecha de solicitud no puede ser en el futuro");
        }
        this.fechaSolicitud = fechaSolicitud;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        if (estado == null) {
            throw new IllegalArgumentException("El estado es obligatorio");
        }
        this.estado = estado;
    }
}
