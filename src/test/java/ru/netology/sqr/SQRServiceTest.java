package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQR.csv")
    public void testSQRService(int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.calculate(min, max);

        assertEquals(expected, actual);
    }
}
