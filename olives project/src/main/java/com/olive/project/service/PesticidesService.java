package com.olive.project.service;

import com.olive.project.model.Olive;
import com.olive.project.repository.FertilizerRepository;
import com.olive.project.repository.OliveRepository;
import com.olive.project.repository.PesticidesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class PesticidesService {

    private final PesticidesRepository pesticidesRepository;

    private final OliveRepository oliveRepository;

    @Autowired
    public PesticidesService(PesticidesRepository pesticidesRepository, OliveRepository oliveRepository, EntityManagerFactory emf) {
        this.pesticidesRepository = pesticidesRepository;
        this.oliveRepository= oliveRepository;
        this.emf = emf;
    }

    private final EntityManagerFactory emf;

    public String insertPesticide(Long oliveId) {
        return null;
    }
}
