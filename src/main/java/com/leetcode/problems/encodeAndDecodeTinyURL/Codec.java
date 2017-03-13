package com.leetcode.problems.encodeAndDecodeTinyURL;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * https://leetcode.com/problems/encode-and-decode-tinyurl/#/description
 * <p>
 * 535. Encode and Decode TinyURL
 * <p>
 * TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.
 * <p>
 * Design the encode and decode methods for the TinyURL service. There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
 *
 * @author Pavel Belevich
 */
public class Codec {

    private static Random random = new Random();
    private Map<String, String> map = new HashMap<>();

    private static final char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortUrl = random(5);
        map.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

    static String random(int n) {
        final char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            result[i] = chars[random.nextInt(chars.length)];
        }
        return new String(result);
    }

}
