package nl.tst.pg.testpgass1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FahrenheitCelsiusConverter {

    public double fahrenheitToCelsius(double d) {
        double result = ( d - 32.0 ) * ( 5.0 / 9.0 );
        BigDecimal resultTwoDecimal = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
        return resultTwoDecimal.doubleValue();
    }

    public double celsiusToFahrenheit(double v) {
        double result = v * ( 9.0 / 5.0 ) + 32.0;
        BigDecimal resultTwoDecimal = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
        return resultTwoDecimal.doubleValue();
    }
}
