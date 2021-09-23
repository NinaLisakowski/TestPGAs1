package nl.tst.pg.testpgass1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FahrenheitCelsiusConverterTests {

    FahrenheitCelsiusConverter fcc = new FahrenheitCelsiusConverter();

    @Test
    void givenFahrenheit_whenFahrenheitIs1_thenResultIsMinus17Point22Celsius() {
        double result = fcc.fahrenheitToCelsius(1.0);
        assertEquals(-17.22, result);
    }

    @Test
    void givenFahrenheit_whenFahrenheitIs17Point22_thenResultIsMinus8Point21Celsius() {
        double result = fcc.fahrenheitToCelsius(17.22);
        assertEquals(-8.21, result);
    }

    @Test
    void givenFahrenheit_whenFahrenheitIs938_thenResultIs503Point33Celsius() {
        double result = fcc.fahrenheitToCelsius(938.0);
        assertEquals(503.33, result);
    }

    @Test
    void givenCelsius_whenCelsiusIs1_thenResultIs33Point8Fahrenheit() {
        double result = fcc.celsiusToFahrenheit(1.0);
        assertEquals(33.8, result);
    }

    @Test
    void givenCelsius_whenCelsiusIs435Point81_thenResultIs816Point46Fahrenheit() {
        double result = fcc.celsiusToFahrenheit(435.81);
        assertEquals(816.46, result);
    }

    @Test
    void givenCelsius_whenCelsiusIsMinus83_thenResultIsMinus117Point4ahrenheit() {
        double result = fcc.celsiusToFahrenheit(-83.0);
        assertEquals(-117.4, result);
    }

}