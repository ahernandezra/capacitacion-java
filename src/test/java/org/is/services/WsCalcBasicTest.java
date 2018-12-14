package org.is.services;

import lombok.extern.slf4j.Slf4j;
import org.is.calc.CalcScientific;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
public class WsCalcBasicTest {

    // via SPRING
    @Resource(name="calcWeb")
    public WsCalcBasic wsCalcBasic;

    //Inyeccion por medio de constructor
    //public WsCalcBasic wsCalcBasic = new WsCalcBasic(new CalcScientific());

    //Inyeccion por medio de setter
    /*
    @Before
    public void setUp() throws Exception {
        wsCalcBasic.setCalc(new CalcBasic());
    }
    */
    @Test
    public void sum() {
        log.info("{}",wsCalcBasic.sum(2,2));
    }
}