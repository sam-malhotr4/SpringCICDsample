package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private ResourceController doubleController;

    @Test
    void contextLoads() throws Exception{
        assertThat(doubleController).isNotNull();
    }

}
