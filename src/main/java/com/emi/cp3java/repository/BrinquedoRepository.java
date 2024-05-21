package com.emi.cp3java.repository;

import com.emi.cp3java.model.Brinquedo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrinquedoRepository extends JpaRepository<Brinquedo, Integer> {
    Brinquedo findById(int id);
    Brinquedo save(Brinquedo brinquedo);
}