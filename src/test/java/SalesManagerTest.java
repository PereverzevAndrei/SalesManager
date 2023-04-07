import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SalesManagerTest {

    long[] sls = {50, 100, 150};
    SalesManager sM = new SalesManager(sls);


    @org.junit.jupiter.api.Test
    void max() {
        long max = -1;
        long expect = 150;
        long result = sM.max(sls.length);
        Assertions.assertEquals(expect, result);

    }

    @org.junit.jupiter.api.Test
    void min() {
        long min = sls[0];
        long expect1 = 50;
        long result1 = sM.min();
        Assertions.assertEquals(expect1, result1);

    }

    @org.junit.jupiter.api.Test
    void averageSale() {
        long expect2 = 100;
        long result2 = sM.averageSale();
        Assertions.assertEquals(expect2, result2);

    }
}