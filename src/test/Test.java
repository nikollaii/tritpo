package test;


import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class ComplexTest {

    @Test
    void minus() {
        Complex test=new Complex(1,1);
        test=test.minus(new Complex(10,20));
        Assertions.assertTrue(test.getRe()==-9&&test.getIm()==-19);
    }


}