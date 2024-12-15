package com.xworkz.xworkzcourse.registeration.repository;

import com.xworkz.xworkzcourse.registeration.entity.CourseRegistrationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

@Repository
public class CourseRegistrationRepoImpl implements CourseRegistrationRepo{

    @Autowired
    EntityManagerFactory emf;

    @Override
    public boolean save(CourseRegistrationEntity entity) {
        System.out.println("Running on a save in a repoimpl");
        System.out.println("data in repoImpl:"+entity.toString());
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            em.persist(entity);
            et.commit();
        }
        catch(Exception e)
        {
            if(et.isActive())
            {
                et.rollback();
            }

        }
        finally {
            em.close();
            //` emf.close();
        }


        return false;
    }

    @Override
    public String getNameByEmailAndPassword(String email, String password) {


        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        String name=null;
        try{
            et.begin();
            Query query=em.createNamedQuery("getNameByEmailAndPassword");
            query.setParameter("byEmail",email).setParameter("byPassword",password);
            name=(String)query.getSingleResult();


            et.commit();
        } catch (Exception e) {
            if(et.isActive()){
                et.rollback();
            }
        }
        finally {
            em.close();
        }
        return name;

    }
}
