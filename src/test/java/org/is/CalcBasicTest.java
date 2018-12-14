package org.is;

import org.is.calc.Calc;
import org.is.calc.CalcBasic;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
@Slf4j
public class CalcBasicTest {

    public Calc calc = new CalcBasic();
    public Double a, b, expected;
    public Class<Throwable> exceptionClass;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Parameterized.Parameters
    public static Collection sums(){
        return Arrays.asList(new Object[][]{
                {2.0d, 2.0d, 4.0d, null},
                {2.0d, -2.0d, 0.0d, null},
                {2.0d, null, null, NullPointerException.class},
        });
    }

    public CalcBasicTest(Double a, Double b, Double expected, Class<Throwable> exceptionClass) {
        this.a = a;
        this.b = b;
        this.expected = expected;
        this.exceptionClass = exceptionClass;
    }

    @Test
    public void sum() throws Exception{
        if(exceptionClass != null) thrown.expect(exceptionClass);
        Double result = calc.sum(a, b);
        log.info(String.valueOf(result));
        Assert.assertEquals(expected, result, 0.0001);
    }

}
