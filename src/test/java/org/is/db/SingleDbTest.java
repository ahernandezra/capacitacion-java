package org.is.db;

import lombok.extern.slf4j.Slf4j;
import org.is.persistence.dao.dto.UserDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({TransactionalTestExecutionListener.class})
@Slf4j
public class SingleDbTest extends AbstractJUnit4SpringContextTests {

    @PersistenceContext(name = "pum")
    private EntityManager em;

    @Test
    public void testDb(){
        Query q = em.createNativeQuery("SELECT SYSDATE FROM DUAL");
        Object o = ((Query) q).getSingleResult();
        log.info("{}", o.toString());
    }

    @Test
    public void testNamedQuery(){
        Query q = em.createNamedQuery("user.getDetail");
        UserDTO user = (UserDTO) q.getSingleResult();
        log.info("{}", user);
    }

    @Test
    public void testSingleProc(){
        //TODO
        //StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("SIMPLE");
        //storedProcedureQuery.execute();
    }

}
