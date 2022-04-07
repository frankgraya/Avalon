package com.avalon.Avalon.Repository;

import com.avalon.Avalon.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
