package ru.netology.javaqa.javaqamvn.servises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class CalcServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/count.csv")
// @CsvSource({
//           "10000,3000,20000,3",
//            "100000,60000,150000,2"
// })
    public void shouldCalc(int income, int expenses, int threshold, int count) {
        CalcService service = new CalcService();

        //int income = 10000;
        //int expenses = 3000;
        //int threshold = 20000;
        //int count = 3;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(count, actual);
    }
}
