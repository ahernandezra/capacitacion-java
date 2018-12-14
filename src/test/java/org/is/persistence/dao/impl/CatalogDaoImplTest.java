package org.is.persistence.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.is.persistence.dao.CatalogDao;
import org.is.persistence.model.Aris;
import org.is.util.AbstractTestDb;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
public class CatalogDaoImplTest extends AbstractTestDb {

    @Resource(name = "catalogDaoImpl")
    private CatalogDao catalogDao;

    @Test
    public void testGetAll(){
        List<Aris> result = catalogDao.findAll(Aris.class);

        log.info("collection length: {}", result.size());
        for(Aris r : result){
            log.info("{}", r);
        }
    }

}
