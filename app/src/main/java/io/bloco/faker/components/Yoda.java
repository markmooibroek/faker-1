package io.bloco.faker.components;

import io.bloco.faker.FakerComponent;
import io.bloco.faker.FakerData;

/**
 * Created by Mark NicePants
 * on 05/03/17 - 14:18
 */

public class Yoda extends FakerComponent {

    public Yoda(FakerData data) {
        super(data);
    }

    public String quote() {
        return fetch("yoda.quotes");
    }

}
