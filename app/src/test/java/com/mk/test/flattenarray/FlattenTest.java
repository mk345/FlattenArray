package com.mk.test.flattenarray;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlattenTest {
    private FlattenClass mFlattenClass;

    @Before
    public void setUp() throws Exception {
        mFlattenClass = new FlattenClass();
    }

    @Test
    public void testFlattenFunctionWithStandardNestedValues() throws Exception {
        Object[] expectedOutput = {"one", "two", "three", "four"};
        assertArrayEquals(expectedOutput, mFlattenClass.flatten(new Object[]{new Object[]{"one", "two", new Object[]{"three"}}, "four"}));
    }

    @Test
    public void testFlattenFunctionWithNullValues() throws Exception {
        Object[] expectedOutput = {"two"};
        assertArrayEquals(expectedOutput, mFlattenClass.flatten(new Object[]{new Object[]{null, "two", new Object[]{null}}, null}));
    }

    @Test
    public void testFlattenFunctionWithNull() throws Exception {
        assertNull(mFlattenClass.flatten(null));
    }

    @Test
    public void testFlattenFunctionWithFlatArray() throws Exception {
        Object[] expectedOutput = {"one", "two", "three", "four"};
        assertArrayEquals(expectedOutput, mFlattenClass.flatten(new Object[]{"one", "two", "three", "four"}));
    }
}
