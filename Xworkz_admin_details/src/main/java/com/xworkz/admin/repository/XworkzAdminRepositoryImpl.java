package com.xworkz.admin.repository;

import com.xworkz.admin.entity.XworkzadminEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class XworkzAdminRepositoryImpl implements XworkzAdminRepository {

    //    @Autowired
//    EntityManagerFactory eMF;
    @Override
    public boolean validateAndSave(XworkzadminEntity entity) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            em.persist(entity);
            et.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            emf.close();
            em.close();

        }

        return true;
    }
}
//
//        EntityManagerFactory eMF=null;
//        EntityManager eM=null;
//        EntityTransaction eT=null;
//
//
//
//        try {
//            eMF = Persistence.createEntityManagerFactory("xworkz");
//            eM = eMF.createEntityManager();
//            eT = eM.getTransaction();
//            eM = eMF.createEntityManager();
//            eT = eM.getTransaction();
//
//
//            eT.begin();
//            eM.persist(entity);
//            eT.commit();
//
//        }
//        catch (Exception e) {
//            if (eT.isActive()) {
//                eT.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            eM.close();
//
//        }
//
//        return true;
//    }
//
//
//


//    }

