package com.itgate.demo.dao;


import com.itgate.demo.models.FichePatient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FichePatientRepository  extends JpaRepository<FichePatient,Long> {
}
