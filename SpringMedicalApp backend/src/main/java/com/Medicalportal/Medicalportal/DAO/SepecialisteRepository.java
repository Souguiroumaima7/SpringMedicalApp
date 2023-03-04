package com.itgate.demo.dao;

import com.itgate.demo.models.Specialiste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SepecialisteRepository  extends JpaRepository<Specialiste,Long> {
}
