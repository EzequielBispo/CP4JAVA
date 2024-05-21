package com.emi.cp3java.service;

import com.emi.cp3java.model.Brinquedo;
import com.emi.cp3java.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrinquedoService {

    @Autowired
    private BrinquedoRepository repository;

    public Brinquedo getBrinquedo(int id) {
        return repository.findById(id);
    }

    public Brinquedo setBrinquedo(Brinquedo brinquedo) {
        return repository.save(brinquedo);
    }

    public Brinquedo deleteBrinquedo(int id) {
        Brinquedo brinquedo = repository.findById(id);
        repository.delete(brinquedo);
        return brinquedo;

    }
    public Brinquedo save(Brinquedo brinquedo) {
        return repository.save(brinquedo);
    }
}