package idv.lesliezou.tests;

import idv.lesliezou.algorithms.SqrtX;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SqrtXTests {

    @Test
    public void testSqrtXSuccessful(){
        SqrtX testObject = new SqrtX();
        Assertions.assertEquals(2,testObject.mySqrt(4));
        Assertions.assertEquals(2,testObject.mySqrt(8));
    }
}
