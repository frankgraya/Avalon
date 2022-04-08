package com.avalon.Avalon.Repository;

import com.avalon.Avalon.Model.Transporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransporteRepository extends JpaRepository<Transporte, Long> {
}
