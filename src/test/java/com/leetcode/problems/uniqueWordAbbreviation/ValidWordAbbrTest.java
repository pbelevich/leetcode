package com.leetcode.problems.uniqueWordAbbreviation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class ValidWordAbbrTest {

    @Test
    public void abbriviate() throws Exception {
        assertEquals("it", ValidWordAbbr.abbriviate("it"));
        assertEquals("d1g", ValidWordAbbr.abbriviate("dog"));
        assertEquals("i18n", ValidWordAbbr.abbriviate("internationalization"));
        assertEquals("l10n", ValidWordAbbr.abbriviate("localization"));
    }

    @Test
    public void isUnique() throws Exception {
        final ValidWordAbbr validWordAbbr = new ValidWordAbbr(new String[]{"deer", "door", "cake", "card"});
        assertFalse(validWordAbbr.isUnique("dear"));
        assertTrue(validWordAbbr.isUnique("cart"));
        assertFalse(validWordAbbr.isUnique("cane"));
        assertTrue(validWordAbbr.isUnique("make"));
    }

}