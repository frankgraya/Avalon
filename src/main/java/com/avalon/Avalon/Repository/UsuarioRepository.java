package com.avalon.Avalon.Repository;

import com.avalon.Avalon.Model.Security.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findUsuarioByUsername(String username);
}