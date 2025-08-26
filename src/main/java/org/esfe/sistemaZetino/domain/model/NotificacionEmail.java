package org.esfe.sistemaZetino.domain.model;

public class NotificacionEmail {

    private Integer idNotificacion;
    private Integer idResultado;
    private String asunto;
    private String mensaje;
    private String estadoEnvio;
    private String estado;

    // Constructor vacío
    public NotificacionEmail() {}

    // Constructor con validaciones
    public NotificacionEmail(Integer idNotificacion, Integer idResultado, String asunto, String mensaje, String estadoEnvio, String estado) {
        this.setIdNotificacion(idNotificacion);
        this.setIdResultado(idResultado);
        this.setAsunto(asunto);
        this.setMensaje(mensaje);
        this.setEstadoEnvio(estadoEnvio);
        this.setEstado(estado);
    }

    // Getters y Setters con validaciones
    public Integer getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(Integer idNotificacion) {
        if (idNotificacion != null && idNotificacion < 0) {
            throw new IllegalArgumentException("El id de notificación no puede ser negativo");
        }
        this.idNotificacion = idNotificacion;
    }

    public Integer getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(Integer idResultado) {
        if (idResultado == null) {
            throw new IllegalArgumentException("El id de resultado es obligatorio");
        }
        this.idResultado = idResultado;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        if (asunto == null || asunto.isBlank()) {
            throw new IllegalArgumentException("El asunto es obligatorio");
        }
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        if (mensaje == null || mensaje.isBlank()) {
            throw new IllegalArgumentException("El mensaje es obligatorio");
        }
        this.mensaje = mensaje;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        if (estadoEnvio == null || estadoEnvio.isBlank()) {
            throw new IllegalArgumentException("El estado de envío es obligatorio");
        }
        this.estadoEnvio = estadoEnvio;
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
