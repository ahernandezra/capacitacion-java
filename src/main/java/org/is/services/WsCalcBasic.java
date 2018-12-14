package org.is.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.is.calc.Calc;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WsCalcBasic implements WsCalc {

    private Calc calc;

    public Double sum(double a, double b) {
        return calc.sum(a,b);
    }

    public Double div(double a, double b) {
        return calc.div(a,b);
    }
}
