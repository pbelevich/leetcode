package com.leetcode.problems.encodeAndDecodeStrings;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class CodecTest {

    @Test
    public void decode() throws Exception {
        final Codec codec = new Codec();
        final List<String> actual = codec.decode(codec.encode(Arrays.asList("abc///def", "/////", "", "\n\n", "qwerty")));
    }

}