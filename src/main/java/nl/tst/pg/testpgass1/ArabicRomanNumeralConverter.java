package nl.tst.pg.testpgass1;

public class ArabicRomanNumeralConverter {
    public String arabicToRoman(int i) {
        String result;
        switch (i) {
            case 1:
                result = "I";
                break;
            case 5:
                result = "V";
                break;
            case 10:
                result = "X";
                break;
            case 50:
                result = "L";
                break;
            case 100:
                result = "C";
                break;
            case 500:
                result = "D";
                break;
            case 1000:
                result = "M";
                break;
            default:
                result = "Something's wrong";

        }
        return result;
    }
}
