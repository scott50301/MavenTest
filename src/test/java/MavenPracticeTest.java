import org.junit.Before;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MavenPracticeTest {
    double N1 = 5.0;
    double N2 = 2.0;


    @Test
    void testAddInteger() {
        MavenPractice mp = new MavenPractice();
        double expectedRes = mp.add(N1, N2);
        assertEquals(expectedRes , 7.0);
    }


    @Test
    void testMinus() {
        MavenPractice mp = new MavenPractice();
        double expectedRes = mp.minus(N1, N2);
        assertEquals(expectedRes , 3.0);
    }

    @Test
    void testProduce() {
        MavenPractice mp = new MavenPractice();
        double expectedRes = mp.produce(N1, N2);
        assertEquals(expectedRes , 10.0);
    }

    @Test
    void testPivide() {
        MavenPractice mp = new MavenPractice();
        double expectedRes = mp.divide(N1, N2);
        assertEquals(expectedRes , 2.5);
    }
}