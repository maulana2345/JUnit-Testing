package com.naufal.junit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testAddition(){
        MathOperation math = new MathOperation();
        int result = math.add(3,4);
        assertEquals(7, result);
    }
}