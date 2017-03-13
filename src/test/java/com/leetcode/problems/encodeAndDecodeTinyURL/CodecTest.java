package com.leetcode.problems.encodeAndDecodeTinyURL;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class CodecTest {

    public static final Codec CODEC = new Codec();

    @Test
    public void encode() throws Exception {
        for (int i = 0; i < 1000; i++) {
            final String longUrl = Codec.random(25);
            assertEquals(longUrl, CODEC.decode(CODEC.encode(longUrl)));
        }
    }

}