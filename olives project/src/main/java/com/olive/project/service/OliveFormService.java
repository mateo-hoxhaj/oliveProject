package com.olive.project.service;

import com.olive.project.model.Olive;
import com.olive.project.repository.OliveFormRepository;
import com.olive.project.repository.OliveRepository;
import com.olive.project.repository.PesticidesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Optional;

@Service
public class OliveFormService {

    private final OliveFormRepository oliveFormRepository;

    private final OliveRepository oliveRepository;

    @Autowired
    public OliveFormService(OliveFormRepository oliveFormRepository, OliveRepository oliveRepository, EntityManagerFactory emf) {
        this.oliveFormRepository = oliveFormRepository;
        this.oliveRepository= oliveRepository;
        this.emf = emf;
    }

    private final EntityManagerFactory emf;

    public int deleteForm(Long oliveId) {
       Olive olive= oliveRepository.findById(oliveId).get();
        int i =0;
        try {
            EntityManager entityManager = emf.createEntityManager();
            entityManager.getTransaction().begin();
            String hql = "Delete from OliveForm f where f.olive_id=:oliveId";
            Query query = entityManager.createQuery(hql);
            query.setParameter("oliveId", olive);
            i = query.executeUpdate();
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
}
