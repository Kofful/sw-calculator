package khai.calculator.services;

import khai.calculator.operations.ModuloInterface;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModuloOfNumberTest {
    private ModuloInterface moduloService;

    @Before
    public void setUp() {
        this.moduloService = new ModuloOfNumber();
    }
    @Test
    public void shouldReturnZeroForEqualNumbers() {
        assertEquals(moduloService.mod(2, 2), 0, 0);
    }

    @Test
    public void shouldReturnTheRightResultForNumbersLessThanHundred() {
        assertEquals(moduloService.mod(90, 100), 90, 0);
        assertEquals(moduloService.mod(100, 90), 10, 0);
    }

    @Test
    public void shouldReturnResultForNumbersBiggerThanHundred() {
        assertEquals(moduloService.mod(951, 1000), 951, 0);
        assertEquals(moduloService.mod(1000, 951), 49, 0);
    }

    @Test
    public void shouldReturnExpectedResultForNegativeNumbers() {
        assertEquals(moduloService.mod(-900, 100), 100, 0);
        assertEquals(moduloService.mod(100, -900), 0, 0);
    }
}
