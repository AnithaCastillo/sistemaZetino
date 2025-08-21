package org.esfe.sistemaZetino.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRol")
    private Integer idRol;

    @NotBlank(message = "El nombre es requerido")
    private String nombre;

    @NotBlank(message = "El estado es requerido")
    private String estado;

    // Relación: Un rol puede tener muchos usuarios
    @OneToMany(mappedBy = "rol", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<UsuarioSistema> usuarios = new HashSet<>();

    // Getters y Setters
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Set<UsuarioSistema> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<UsuarioSistema> usuarios) {
        this.usuarios = usuarios;
    }
}
