package com.olive.project.service;

import com.olive.project.model.Fertilizing;
import com.olive.project.model.Olive;
import com.olive.project.repository.FertilizerRepository;
import com.olive.project.repository.OliveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Date;

@Service
public class FertilizerService {

    private final FertilizerRepository fertilizerRepository;

    private final OliveRepository oliveRepository;

    @Autowired
    public FertilizerService(FertilizerRepository fertilizerRepository, OliveRepository oliveRepository, EntityManagerFactory emf) {
        this.fertilizerRepository = fertilizerRepository;
        this.oliveRepository= oliveRepository;
        this.emf = emf;
    }

    private final EntityManagerFactory emf;

    public String getFertilizerTypeForOlive(Long oliveId) {
        String fertilizerType =null;
        try {
            EntityManager entityManager = emf.createEntityManager();
            String hql= "Select fertilizing_type from Fertilizing f where f.olive_id=:oliveId";
            Query query =  entityManager.createQuery(hql);
            Olive olive= new Olive();
            olive=oliveRepository.findById(oliveId).get();
            query.setParameter("oliveId", olive);
            fertilizerType = query.getResultList().get(0).toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return fertilizerType;
    }


    public Date getFertilizerTimeForOlive(Long oliveId) {
        Date fertilizerTime= null;
        try {
            EntityManager entityManager = emf.createEntityManager();
            String hql= "Select fertilizing_time from Fertilizing f where f.olive_id=:oliveId";
            Query query =  entityManager.createQuery(hql);
            Olive olive= new Olive();
            olive=oliveRepository.findById(oliveId).get();
            query.setParameter("oliveId", olive);
            String result = query.getResultList().get(0).toString();
            fertilizerTime = new SimpleDateFormat("dd/MM/yyyy").parse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return fertilizerTime;
    }


}
