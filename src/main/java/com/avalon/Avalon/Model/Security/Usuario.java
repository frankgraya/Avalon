package com.avalon.Avalon.Model.Security;

import com.avalon.Avalon.Model.VolumetricoSAT;
import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Usuario")
public class Usuario extends SecurityProperties.User {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "username", unique = true, nullable = false)
    String username;

    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "enabled", nullable = false)
    boolean enabled = true;

    @Column(name = "accountExpired", nullable = false)
    boolean accountExpired;

    @Column(name = "accountLocked", nullable = false)
    boolean accountLocked;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "usuarioVolumetrico")
    @ToString.Exclude
    private List<VolumetricoSAT> volumetricoSATList = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Usuario usuario = (Usuario) o;
        return id != null && Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
