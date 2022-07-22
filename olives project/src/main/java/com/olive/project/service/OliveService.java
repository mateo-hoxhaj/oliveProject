package com.olive.project.service;

import com.olive.project.model.Olive;
import com.olive.project.model.Working;
import com.olive.project.repository.FertilizerRepository;
import com.olive.project.repository.OliveRepository;
import com.olive.project.repository.WorkingRepository;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

@Service
public class OliveService {

    private final OliveRepository oliveRepository;
    private final WorkingRepository workingRepository;

    private FertilizerRepository fertilizerRepository;

    private final EntityManagerFactory emf;
    @Autowired
    public OliveService(OliveRepository oliveRepository, EntityManagerFactory emf, WorkingRepository workingRepository) {
        this.oliveRepository = oliveRepository;
        this.workingRepository= workingRepository;
        this.fertilizerRepository=fertilizerRepository;
        this.emf=emf;
    }

    public List<Olive> getAllOlives(){
        return oliveRepository.findAll();
    }

    public void addNewOlive(Olive olive){
        oliveRepository.save(olive);

    }

    public void changeOlivePricePerkg(Long oliveId, Double pricePerKg) {
        Olive olive= oliveRepository.getById(oliveId);
        olive.setOliveprice_per_kg(pricePerKg);
        oliveRepository.save(olive);
    }

    public Working getOliveWorkingTime(Long oliveId) {

        Working workingTime = null;
        try {
            EntityManager entityManager = emf.createEntityManager();
            String hql= "From Working w where w.olive_id=:oliveId";
            Query query =  entityManager.createQuery(hql);
            Olive olive= new Olive();
            olive=oliveRepository.findById(oliveId).get();
            query.setParameter("oliveId", olive);
            workingTime = (Working) query.getResultList().get(0);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return  workingTime;
    }

}

