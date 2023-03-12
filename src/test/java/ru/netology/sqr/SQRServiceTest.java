package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "3, 200, 300",
            "0, -300, 0",
            "1, 400, 400",
            "1, 0, 100",
            "0, 0, 99",
            "90, 100, 9801",
            "90, 89, 10000"
    })
    public void shouldCalcCount(int expected, int upperValue, int underValue) {
        SQRService service = new SQRService();

        int actual = service.calcSqrtRange(upperValue, underValue);

        Assertions.assertEquals(expected, actual);
    }
}
