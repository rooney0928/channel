package com.qunadai.channel;

import android.util.Base64;

import com.qunadai.channel.utils.Base64Tool;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);

    }
    @Test
    public void testBase64() throws Exception {
        String base = "15000983436:111111";
//        Base64Tool.encode(base);
        String base64 = Base64Tool.encode(base);
        assertEquals("1111",base64);

    }
}