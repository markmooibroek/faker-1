package io.bloco.faker.components;

import org.junit.Before;
import org.junit.Test;

import io.bloco.faker.Faker;

import static org.junit.Assert.assertNotNull;

public class YodaTest {

    private Faker faker;

    @Before
    public void setUp() throws Exception {
        faker = new Faker();
    }

    @Test
    public void quote() throws Exception {
        assertNotNull(faker.yoda.quote());
    }

}
