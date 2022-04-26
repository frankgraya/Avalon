package com.avalon.Avalon.Model.Security;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "Rol")
public class Rol {
    private static final long serialVersionUID = 1;

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "authority", unique = true, nullable = false)
    String authority;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Rol rol = (Rol) o;
        return id != null && Objects.equals(id, rol.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    public enum Roles {
        ROLE_USER, ROLE_ADMIN;
    }

}
