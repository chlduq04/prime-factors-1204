import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsTest {

    PrimeFactor primeFactor;

    @BeforeEach
    void setUp() {
        primeFactor = new PrimeFactor();
    }

    @Test
    public void testPrimefactorOf1() {
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }

    @Test
    public void testPrimefactorOf2() {
        assertEquals(Arrays.asList(2), primeFactor.of(2));
    }

    @Test
    public void testPrimefactorOf3() {
        assertEquals(Arrays.asList(3), primeFactor.of(3));
    }

    @Test
    public void testPrimefactorOf4() {
        assertEquals(Arrays.asList(2, 2), primeFactor.of(4));
    }
}