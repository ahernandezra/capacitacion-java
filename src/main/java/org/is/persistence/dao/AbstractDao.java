package org.is.persistence.dao;

import javax.persistence.EntityManager;
import java.util.Collection;
import java.util.List;

public interface AbstractDao {

    <T> void saveCollection(Collection<T> col);

    <T> T save(T entity);

    EntityManager getEntityManager();

    <T,K> T findById(Class classy, K id);

    <T> List<T> findAll(Class type);

}
