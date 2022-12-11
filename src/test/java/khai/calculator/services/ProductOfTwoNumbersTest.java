package khai.calculator.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Answers;
import org.mockito.Mockito;

import java.util.random.RandomGenerator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ProductOfTwoNumbersTest {
    private ProductOfTwoNumbers productService;

    @Before
    public void setUp() {
        this.productService = Mockito.mock(ProductOfTwoNumbers.class);
        Mockito.when(productService.multiply()).thenCallRealMethod();
    }

    @Test
    public void productOfTwoNegativeNumbers() {
        Mockito.when(productService.getFirstMultiplier()).thenReturn((double) -5);
        Mockito.when(productService.getSecondMultiplier()).thenReturn((double) -5);
        assertEquals(25, productService.multiply(), 0);

        Mockito.verify(productService).getFirstMultiplier();
        Mockito.verify(productService).getSecondMultiplier();
        Mockito.verify(productService).multiply();
        Mockito.verifyNoMoreInteractions(productService);
    }

    @Test
    public void productOfOneNegativeAndPositiveNumber() {
        Mockito.when(productService.getFirstMultiplier()).thenReturn((double) -5);
        Mockito.when(productService.getSecondMultiplier()).thenReturn(5.0);
        assertEquals(-25, productService.multiply(), 0);
        Mockito.when(productService.getFirstMultiplier()).thenReturn(5.0);
        Mockito.when(productService.getSecondMultiplier()).thenReturn((double) -5);
        assertEquals(-25, productService.multiply(), 0);

        Mockito.verify(productService, Mockito.times(2)).getFirstMultiplier();
        Mockito.verify(productService, Mockito.times(2)).getSecondMultiplier();
        Mockito.verify(productService, Mockito.times(2)).multiply();
        Mockito.verifyNoMoreInteractions(productService);
    }

    @Test
    public void productOfDoubleNumbers() {
        Mockito.when(productService.getFirstMultiplier()).thenReturn(50.0);
        Mockito.when(productService.getSecondMultiplier()).thenReturn(-0.1);
        assertEquals(-5, productService.multiply(), 0);

        Mockito.when(productService.getFirstMultiplier()).thenReturn(-0.1);
        Mockito.when(productService.getSecondMultiplier()).thenReturn(50.0);

        assertEquals(-5, productService.multiply(), 0);

        Mockito.when(productService.getFirstMultiplier()).thenReturn(50.0);
        Mockito.when(productService.getSecondMultiplier()).thenReturn(0.1);
        assertEquals(5, productService.multiply(), 0);

        Mockito.verify(productService, Mockito.times(3)).getFirstMultiplier();
        Mockito.verify(productService, Mockito.times(3)).getSecondMultiplier();
        Mockito.verify(productService, Mockito.times(3)).multiply();
        Mockito.verifyNoMoreInteractions(productService);
    }

    @Test
    public void productOfTens() {
        Mockito.when(productService.getFirstMultiplier()).thenReturn(10.0);
        Mockito.when(productService.getSecondMultiplier()).thenReturn(50.0);
        assertEquals(500, productService.multiply(), 0);

        Mockito.when(productService.getFirstMultiplier()).thenReturn(50.0);
        Mockito.when(productService.getSecondMultiplier()).thenReturn(10.0);
        assertEquals(500, productService.multiply(), 0);

        Mockito.verify(productService, Mockito.times(2)).getFirstMultiplier();
        Mockito.verify(productService, Mockito.times(2)).getSecondMultiplier();
        Mockito.verify(productService, Mockito.times(2)).multiply();
        Mockito.verifyNoMoreInteractions(productService);
    }

    @Test
    public void shouldUpdateValues() {
        doAnswer(Answers.CALLS_REAL_METHODS).when(productService).setFirstMultiplier(anyDouble());
        doAnswer(Answers.CALLS_REAL_METHODS).when(productService).setSecondMultiplier(anyDouble());

        when(productService.getFirstMultiplier()).thenCallRealMethod();
        when(productService.getSecondMultiplier()).thenCallRealMethod();

        double firstMultiplier = RandomGenerator.getDefault().nextDouble();
        double secondMultiplier = RandomGenerator.getDefault().nextDouble();

        productService.setFirstMultiplier(firstMultiplier);
        productService.setSecondMultiplier(secondMultiplier);

        assertEquals(firstMultiplier, productService.getFirstMultiplier(), 0);
        assertEquals(secondMultiplier, productService.getSecondMultiplier(), 0);

        Mockito.verify(productService).getFirstMultiplier();
        Mockito.verify(productService).getSecondMultiplier();
        Mockito.verify(productService).setSecondMultiplier(anyDouble());
        Mockito.verify(productService).setFirstMultiplier(anyDouble());
        Mockito.verifyNoMoreInteractions(productService);
    }

}
