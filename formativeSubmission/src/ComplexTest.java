import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import formativeSubmission.Complex;

class ComplexTest {

    @Test
    void testBasic() {
        /* Constructor should put the first parameter as the real part and second as the imaginary part.
         * real() should return real part, imag() imaginary part.
         */
        Complex a = new Complex(4.2, 5.7);
        assertEquals(4.2, a.real(), 1e-6);
        assertEquals(5.7, a.imag(), 1e-6);
        Complex b = new Complex();
        assertEquals(0, b.real(), 1e-6);
        assertEquals(0, b.imag(), 1e-6);
    }
    
    @Test
    void testMagnitude() {
        /* magnitude() should return the magnitude of the complex number */
        Complex a = new Complex(9.6, 11.5);
        assertEquals(14.98032042, a.magnitude(), 1e-6);
    }
    
    @Test
    void testArgument() {
        /* argument() should return the argument of the complex number */
        Complex a = new Complex(9.6, 11.5);
        assertEquals(0.87520335, a.argument(), 1e-6);
    }
    
    @Test
    void testAdd() {
        /* add() should return a new complex number which is the sum of this and the parameter */
        Complex a = new Complex(6.6, 12.9);
        Complex b = new Complex(13.1, 13.5);
        Complex c = a.add(b);
        assertEquals(19.7, c.real(), 1e-6);
        assertEquals(26.4, c.imag(), 1e-6);
    }
    
    @Test
    void testToString() {
        /* toString() should return a string like 1.2 + j3.4 where 1.2 is the real part
         * and 3.4 the imaginary part.
         */
        Complex a = new Complex(1.2, 3.4);
        assertEquals("1.2 + j3.4", a.toString());
        Complex b = new Complex(1.2, 0.0);
        assertEquals("1.2", b.toString());
        Complex c = new Complex(0.0, 9.3);
        assertEquals("j9.3", c.toString());
        Complex d = new Complex(1.2, -3.4);
        assertEquals("1.2 - j3.4", d.toString());
    }
}
