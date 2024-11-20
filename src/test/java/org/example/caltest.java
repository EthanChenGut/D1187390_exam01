package org.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;
class caltest {

    @ParameterizedTest
    @CsvFileSource(resources = "/test.csv", numLinesToSkip = 1)
    void malpractice(int day, int member, int s, int ticket, int expect)throws Exception {
        int p= calculate.calculateprice(day,member,s,ticket);
        assertEquals(p, expect);
    }
}