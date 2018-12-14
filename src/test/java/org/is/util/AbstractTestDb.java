package org.is.util;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

@ContextConfiguration(locations = { "classpath:ApplicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({TransactionalTestExecutionListener.class})
public class AbstractTestDb extends AbstractJUnit4SpringContextTests {
}
