package nl.tst.pg.testpgass1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ArabicRomanNumeralConverterTests {

    ArabicRomanNumeralConverter arnc = new ArabicRomanNumeralConverter();

    @Test
    void givenArabic_whenArabicIs1_thenResultIsRomanI() {
        String result = arnc.arabicToRoman(1);
        assertEquals("I", result);
    }

    @Test
    void givenArabic_whenArabicIs5_thenResultIsRomanV() {
        String result = arnc.arabicToRoman(5);
        assertEquals("V", result);
    }

    @Test
    void givenArabic_whenArabicIs10_thenResultIsRomanX() {
        String result = arnc.arabicToRoman(10);
        assertEquals("X", result);
    }

    @Test
    void givenArabic_whenArabicIs50_thenResultIsRomanL() {
        String result = arnc.arabicToRoman(50);
        assertEquals("L", result);
    }

    @Test
    void givenArabic_whenArabicIs100_thenResultIsRomanC() {
        String result = arnc.arabicToRoman(100);
        assertEquals("C", result);
    }

    @Test
    void givenArabic_whenArabicIs500_thenResultIsRomanD() {
        String result = arnc.arabicToRoman(500);
        assertEquals("D", result);
    }

    @Test
    void givenArabic_whenArabicIs1000_thenResultIsRomanM() {
        String result = arnc.arabicToRoman(1000);
        assertEquals("M", result);
    }

}
