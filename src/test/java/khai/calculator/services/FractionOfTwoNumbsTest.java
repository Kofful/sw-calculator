package khai.calculator.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Answers;
import org.mockito.Mockito;

import java.util.random.RandomGenerator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class FractionOfTwoNumbsTest {
    private FractionOfTwoNumbs fractionService;

    @Before
    public void setUp() {
        this.fractionService = Mockito.mock(FractionOfTwoNumbs.class);
        Mockito.when(fractionService.divide()).thenCallRealMethod();
    }
    @Test
    public void divide() {
        Mockito.when(fractionService.getDivisible()).thenReturn((double) 1);
        Mockito.when(fractionService.getDivisor()).thenReturn((double) 2);
        assertEquals(0.5, fractionService.divide(), 0);

        Mockito.verify(fractionService).getDivisible();
        Mockito.verify(fractionService).getDivisor();
        Mockito.verify(fractionService).divide();
        Mockito.verifyNoMoreInteractions(fractionService);
    }

    @Test
    public void divideOfOneAndFour() {
        Mockito.when(fractionService.getDivisible()).thenReturn((double) 1);
        Mockito.when(fractionService.getDivisor()).thenReturn((double) 4);
        assertEquals(0.25, fractionService.divide(), 0);

        Mockito.verify(fractionService).getDivisible();
        Mockito.verify(fractionService).getDivisor();
        Mockito.verify(fractionService).divide();
        Mockito.verifyNoMoreInteractions(fractionService);
    }

    @Test
    public void divideOfTwoBigNums() {
        Mockito.when(fractionService.getDivisible()).thenReturn((double) 12);
        Mockito.when(fractionService.getDivisor()).thenReturn((double) 65);
        assertEquals(0.18461538461538463, fractionService.divide(), 0);

        Mockito.verify(fractionService).getDivisible();
        Mockito.verify(fractionService).getDivisor();
        Mockito.verify(fractionService).divide();
        Mockito.verifyNoMoreInteractions(fractionService);
    }

    @Test
    public void divideOfTwoAndThree() {
        Mockito.when(fractionService.getDivisible()).thenReturn((double) 2);
        Mockito.when(fractionService.getDivisor()).thenReturn((double) 3);
        assertEquals(0.6666666666666666, fractionService.divide(), 0);

        Mockito.verify(fractionService).getDivisible();
        Mockito.verify(fractionService).getDivisor();
        Mockito.verify(fractionService).divide();
        Mockito.verifyNoMoreInteractions(fractionService);
    }

    @Test
    public void divideOfThreeAndFour() {
        Mockito.when(fractionService.getDivisible()).thenReturn((double) 3);
        Mockito.when(fractionService.getDivisor()).thenReturn((double) 4);
        assertEquals(0.75, fractionService.divide(), 0);

        Mockito.verify(fractionService).getDivisible();
        Mockito.verify(fractionService).getDivisor();
        Mockito.verify(fractionService).divide();
        Mockito.verifyNoMoreInteractions(fractionService);
    }

    @Test
    public void shouldUpdateValues() {
        doAnswer(Answers.CALLS_REAL_METHODS).when(fractionService).setDivisible(anyDouble());
        doAnswer(Answers.CALLS_REAL_METHODS).when(fractionService).setDivisor(anyDouble());

        when(fractionService.getDivisible()).thenCallRealMethod();
        when(fractionService.getDivisor()).thenCallRealMethod();

        double firstDiv = RandomGenerator.getDefault().nextDouble();
        double secondDiv = RandomGenerator.getDefault().nextDouble();

        fractionService.setDivisible(firstDiv);
        fractionService.setDivisor(secondDiv);

        assertEquals(firstDiv, fractionService.getDivisible(), 0);
        assertEquals(secondDiv, fractionService.getDivisor(), 0);

        Mockito.verify(fractionService).getDivisible();
        Mockito.verify(fractionService).getDivisor();
        Mockito.verify(fractionService).setDivisible(anyDouble());
        Mockito.verify(fractionService).setDivisor(anyDouble());
        Mockito.verifyNoMoreInteractions(fractionService);
    }
}