package org.is.persistence.dao.impl;

import org.is.persistence.dao.AbstractDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Collection;
import java.util.List;

public class AbstractDaoOps implements AbstractDao {

    @PersistenceContext(name = "pum")
    protected EntityManager em;


    public <T> void saveCollection(Collection<T> col) {
        for(T e: col){
            em.persist(e);
        }
    }

    public <T> T save(T entity) {
        em.persist(entity);
        return (T) entity;
    }

    public EntityManager getEntityManager() { return em; }

    public <T, K> T findById(Class classy, K id) { return (T) em.find(classy, id); }

    public <T> List<T> findAll(Class type) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> q = cb.createQuery(type);
        Root<T> c = q.from(type);
        q.select(c).where();
        TypedQuery<T> query = em.createQuery(q);

        return query.getResultList();
    }
}
