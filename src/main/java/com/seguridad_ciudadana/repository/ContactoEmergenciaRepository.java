package com.seguridad_ciudadana.repository;

import com.seguridad_ciudadana.entity.ContactoEmergencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoEmergenciaRepository extends JpaRepository<ContactoEmergencia,Long> {
}
