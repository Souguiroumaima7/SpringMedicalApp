package com.itgate.demo.dao;


import com.itgate.demo.models.Rdv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RdvRepository extends JpaRepository<Rdv,Long> {
}
