package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class GetConsecutiveDuplicatesTest {
    private void test(String[] array, String[] expectedArray) {
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
        Assert.assertEquals(actual, expectedArray);
    }


    @Test
    public void testSinglePairRemoval1() {
        test(
                new String[]{"aba", "aba"},
                new String[]{"aba"});
    }

    @Test
    public void testSinglePairRemoval2() {
        test(
                new String[]{"aba", "aba", "a"},
                new String[]{"aba", "a"});
    }

    @Test
    public void testRemoveConsecutiveDuplicates5() {
        test(
                new String[]{"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"},
                new String[]{"aba", "baa", "bab", "bba", "bbb"});
    }


    @Test
    public void testRemoveConsecutiveDuplicates6() {
        test(
                new String[]{"aba", "aba", "baa", "bab", "bba", "zzz", "bba", "bba", "bba", "bbb", "bbb"},
                new String[]{"aba", "baa", "bab", "bba", "zzz", "bba", "bbb"});
    }


    @Test
    public void testRemoveConsecutiveDuplicates7() {
        test(
                new String[]{"aba", "aba", "baa", "bab", "bba", "zzz", "bba", "bba", "bba", "aba", "bbb"},
                new String[]{"aba", "baa", "bab", "bba", "zzz", "bba", "aba", "bbb"});
    }

}
