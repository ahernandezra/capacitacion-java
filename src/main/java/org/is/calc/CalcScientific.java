package org.is.calc;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalcScientific implements Calc {
    public Double sum(double a, double b) {
        log.info("I'm scientific");
        return a+b;
    }

    public Double div(double a, double b) {
        log.info("I'm scientific");
        return a/b;
    }
}
