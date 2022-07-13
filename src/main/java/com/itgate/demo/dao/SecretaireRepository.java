package com.itgate.demo.dao;

import com.itgate.demo.models.Secretaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretaireRepository extends JpaRepository<Secretaire,Long>
{
}
