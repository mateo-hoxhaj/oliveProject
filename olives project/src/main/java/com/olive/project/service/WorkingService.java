package com.olive.project.service;

import com.olive.project.model.Olive;
import com.olive.project.repository.OliveRepository;
import com.olive.project.repository.WorkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.Date;

@Service
public class WorkingService {

    private final WorkingRepository workingRepository;

    private final OliveRepository oliveRepository;

    private final EntityManagerFactory emf;

    @Autowired
    public WorkingService(WorkingRepository workingRepository, OliveRepository oliveRepository, EntityManagerFactory emf) {
        this.workingRepository = workingRepository;
        this.oliveRepository = oliveRepository;
        this.emf = emf;
    }

    @Transactional
    @Modifying
    public int changeOliveWorkingTime(Long oliveId, Date workingTime) {
        int i = 0;
        try {
            EntityManager entityManager = emf.createEntityManager();
            entityManager.getTransaction().begin();
            String hql = "Update Working w set w.working_time=:workingTime  where w.olive_id=:oliveId";
            Query query = entityManager.createQuery(hql);
            Olive olive = oliveRepository.findById(oliveId).get();
            query.setParameter("workingTime", workingTime);
            query.setParameter("oliveId", olive);
            i=query.executeUpdate();
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }


    @Transactional
    @Modifying
    public int changeOliveWorkingType(Long oliveId, String workingType) {
        int i = 0;
        try {
            EntityManager entityManager = emf.createEntityManager();
            entityManager.getTransaction().begin();
            String hql = "Update Working w set w.working_type=:workingType  where w.olive_id=:oliveId";
            Query query = entityManager.createQuery(hql);
            Olive olive = oliveRepository.findById(oliveId).get();
            query.setParameter("workingType", workingType);
            query.setParameter("oliveId", olive);
            i=query.executeUpdate();
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }


}
