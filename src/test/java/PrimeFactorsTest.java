import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsTest {


    @Test
    public void testPrimefactorOf1() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }

    @Test
    public void testPrimefactorOf2() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(2), primeFactor.of(2));
    }
}