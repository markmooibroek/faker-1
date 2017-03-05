package io.bloco.faker.components;

import org.junit.Before;
import org.junit.Test;

import io.bloco.faker.Faker;

import static org.junit.Assert.assertNotNull;

public class CatTest {

    private Faker faker;

    @Before
    public void setUp() throws Exception {
        faker = new Faker();
    }

    @Test
    public void name() throws Exception {
        assertNotNull(faker.cat.name());
    }

}
